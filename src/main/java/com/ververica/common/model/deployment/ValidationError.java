package com.ververica.common.model.deployment;

import lombok.Data;

@Data
public class ValidationError {
  private final String attribute;
  private final String message;
  private final ValidationErrorReason reason;
}
