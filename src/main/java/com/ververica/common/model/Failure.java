package com.ververica.common.model;

import lombok.Data;

import java.util.Date;

@Data
public class Failure {
  String message;
  String reason;
  Date failedAt;
}
