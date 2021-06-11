package com.ververica.common.resp;

import com.ververica.common.model.deployment.PlanValidationResult;
import com.ververica.common.model.deployment.ValidationResult;
import com.ververica.common.model.draft.ArtifactValidation;
import lombok.Data;

@Data
public class ValidateDeploymentResp {
  /** Validation result, true or false */
  Boolean success;

  /** Message to describe more details. */
  String message;

  /** Artifact kind, e.g. JAR, SQLSCRIPT, PYTHON */
  String kind;

  /** The deployment validation result. */
  ValidationResult deploymentValidation;

  /** The plan validation result. */
  PlanValidationResult planValidation;

  /** The artifact validation. */
  ArtifactValidation artifactValidation;
}
