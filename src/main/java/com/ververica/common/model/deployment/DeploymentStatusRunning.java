package com.ververica.common.model.deployment;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DeploymentStatusRunning {
  String jobId;

  // Time of initial transition to {status.state: running}.
  Date transitionTime;

  // Conditions that apply to this status state.
  List<DeploymentCondition> conditions;
}
