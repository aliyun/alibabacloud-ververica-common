package com.ververica.common.model.draft;

import com.ververica.common.model.sql.ErrorDetails;
import com.ververica.common.model.sql.ValidationResult;
import lombok.Data;

@Data
public class ArtifactValidation {
  ErrorDetails errorDetails;
  ValidationResult validationResult;
}
