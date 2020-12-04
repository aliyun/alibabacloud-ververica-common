package com.ververica.common.util;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.*;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class JsonUtil {
  private static final ObjectMapper MAPPER = new ObjectMapper();

  static {
    MAPPER.configure(SerializationFeature.INDENT_OUTPUT, true);
    MAPPER.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
    MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
    MAPPER.configure(DeserializationFeature.READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE, true);
    MAPPER.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    MAPPER.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_ENUMS, true);
    MAPPER.configure(MapperFeature.AUTO_DETECT_CREATORS, true);
    MAPPER.configure(MapperFeature.AUTO_DETECT_GETTERS, true);
    MAPPER.configure(MapperFeature.AUTO_DETECT_SETTERS, true);
    MAPPER.configure(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES, true);
    MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
  }

  public static String toJsonWithNoException(Object value) {
    try {
      return MAPPER.writeValueAsString(value);
    } catch (Exception e) {
      log.debug("To json exception", e);
      return null;
    }
  }

  public static String toJson(Object value) throws JsonProcessingException {
    return MAPPER.writeValueAsString(value);
  }

  public static <T> T toBean(String content, TypeReference<T> valueTypeRef)
      throws JsonProcessingException {
    return MAPPER.readValue(content, valueTypeRef);
  }

  public static <T> T toBean(String content, Class<T> valueType) throws JsonProcessingException {
    return MAPPER.readValue(content, valueType);
  }

  public static byte[] toJsonBytes(Object value) throws JsonProcessingException {
    return MAPPER.writeValueAsBytes(value);
  }
}
