package com.ververica.common.model.auth;

import lombok.Data;

@Data
public class SdkAuth {
  String aliyunUid;
  String empId;
  String uuid;
  String applyUrl;
  String state;
}
