package com.ververica.common.model.deployment;

import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class DeploymentStatusRunning {
  String jobId;

  // Time of initial transition to {status.state: running}.
  Date transitionTime;

  // Conditions that apply to this status state.
  List<DeploymentCondition> conditions;
}
