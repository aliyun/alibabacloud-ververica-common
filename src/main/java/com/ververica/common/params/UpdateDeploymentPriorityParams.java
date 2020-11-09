package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateDeploymentPriorityParams {

  // [0, 5]
  Integer priority;
}
