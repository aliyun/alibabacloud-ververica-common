package com.ververica.common.model.deployment;

import lombok.Data;

@Data
public class PlanValidationResult {
  /** Validation result, true or false */
  Boolean success;

  /** Message to describe more details. */
  String message;

  /**
   * Resource Plan For better performance, we will retrieve the resoruce plan from the validation
   * stage.
   */
  String resourcePlan;

  /** Exec Plan Same reason with resource plan */
  String execPlan;
}
