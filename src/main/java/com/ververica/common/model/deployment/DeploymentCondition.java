package com.ververica.common.model.deployment;

import lombok.Data;

import java.util.Date;

@Data
public class DeploymentCondition {
  // Type of condition.
  String type;

  // Status of the condition.
  DeploymentConditionStatus status;

  // A short message explaining the condition.
  String message;

  // Reason for the last transition of the condition.
  String reason;

  // Time of last transition. Updated on every change of the condition's status.
  // This time differs from lastUpdateTime if an update modified the reason,
  // but not the status.
  Date lastTransitionTime;

  // Time of last update to this condition.
  Date lastUpdateTime;
}
