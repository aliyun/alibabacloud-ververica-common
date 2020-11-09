package com.ververica.common.params;

import com.ververica.common.model.deployment.DeploymentState;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class UpdateDeploymentDesiredStateParams {

  @NotNull
  DeploymentState state;
}
