package com.ververica.common.model.deployment;

import java.util.Set;
import lombok.Data;

@Data
public class ValidationResult {
  Set<ValidationError> errors;
}
