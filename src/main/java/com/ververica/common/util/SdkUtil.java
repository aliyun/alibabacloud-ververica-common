package com.ververica.common.util;

import com.aliyuncs.AcsError;
import com.aliyuncs.AcsRequest;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.FormatType;
import com.aliyuncs.http.HttpResponse;
import com.aliyuncs.reader.Reader;
import com.aliyuncs.reader.ReaderFactory;
import com.aliyuncs.transform.UnmarshallerContext;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import java.lang.reflect.Field;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SdkUtil {

  private static final String SIGNATURE_BEGIN = "string to sign is:";

  public static String getHttpContentString(IAcsClient client, AcsRequest request)
      throws ClientException, JsonProcessingException {
    HttpResponse baseResponse = client.doAction(request);
    if (isSuccess(baseResponse)) {
      return baseResponse.getHttpContentString();
    } else {
      AcsError error = readError(baseResponse);
      if (500 <= baseResponse.getStatus()) {
        throw new ServerException(
            error.getErrorCode(), error.getErrorMessage(), error.getRequestId());
      } else if (400 == baseResponse.getStatus()
          && ("IncompleteSignature".equals(error.getErrorCode())
              || "SignatureDoesNotMatch".equals(error.getErrorCode()))) {
        String errorMessage = error.getErrorMessage();
        Pattern startPattern = Pattern.compile(SIGNATURE_BEGIN);
        Matcher startMatcher = startPattern.matcher(errorMessage);
        if (startMatcher.find()) {
          int start = startMatcher.end();
          String errorStrToSign = errorMessage.substring(start);
          String strToSign = getStrToSign(request);
          if (strToSign.equals(errorStrToSign)) {
            throw new ClientException(
                "SDK.InvalidAccessKeySecret",
                "Specified Access Key Secret is not valid.",
                error.getRequestId());
          }
        }
      }
      throw new ClientException(
          error.getErrorCode(),
          error.getErrorMessage(),
          error.getRequestId(),
          error.getErrorDescription());
    }
  }

  private static boolean isSuccess(HttpResponse response)
      throws ClientException, JsonProcessingException {
    if (response.isSuccess()) {
      Map<String, Object> result =
          JsonUtil.toBean(
              response.getHttpContentString(), new TypeReference<Map<String, Object>>() {});
      return !result.containsKey("Message");
    }
    return false;
  }

  private static String getStrToSign(AcsRequest request) {
    try {
      Field field = request.getClass().getField("strToSign");
      field.setAccessible(true);
      return (String) field.get(request);
    } catch (Exception e) {
      log.debug("", e);
      return "";
    }
  }

  private static AcsError readError(HttpResponse httpResponse) throws ClientException {
    AcsError error = new AcsError();
    String responseEndpoint = "Error";
    FormatType format = httpResponse.getHttpContentType();
    Reader reader = ReaderFactory.createInstance(format);
    UnmarshallerContext context = new UnmarshallerContext();
    String stringContent = httpResponse.getHttpContentString();

    if (stringContent == null) {
      error.setErrorCode("(null)");
      error.setErrorMessage("(null)");
      error.setRequestId("(null)");
      error.setStatusCode(httpResponse.getStatus());
      return error;
    } else {
      context.setResponseMap(reader.read(stringContent, responseEndpoint));
      return error.getInstance(context);
    }
  }
}
