package com.ververica.common.model.deployment;

import java.util.Set;
import lombok.Data;

@Data
public class ValidationResult {
  private final Set<ValidationError> errors;
}
