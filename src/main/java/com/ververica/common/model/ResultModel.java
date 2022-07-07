package com.ververica.common.model;

import lombok.Getter;

@Getter
public class ResultModel<T> {

  String requestId;
  Boolean success;
  Integer httpCode;
  String message;
  String reason;
  String status;
  T data;

  public void setData(String requestId, T data) {
    this.success = true;
    this.httpCode = 200;
    this.requestId = requestId;
    this.data = data;
  }

  public void error(String requestId, int httpCode, String reason, String message) {
    this.success = false;
    this.requestId = requestId;
    this.httpCode = httpCode;
    this.reason = reason;
    this.message = message;
  }
}
