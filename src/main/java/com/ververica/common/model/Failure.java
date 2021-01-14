package com.ververica.common.model;

import java.util.Date;
import lombok.Data;

@Data
public class Failure {
  String message;
  String reason;
  Date failedAt;
}
