package com.ververica.common.resp;

import com.ververica.common.model.auth.SdkAuth;
import lombok.Data;

@Data
public class BindSdkAuthResp {
  SdkAuth sdkAuth;
}
