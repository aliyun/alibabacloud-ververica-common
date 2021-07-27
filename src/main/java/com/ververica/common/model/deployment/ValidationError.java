package com.ververica.common.model.deployment;

import lombok.Data;

@Data
public class ValidationError {
  String attribute;
  String message;
  ValidationErrorReason reason;
}
