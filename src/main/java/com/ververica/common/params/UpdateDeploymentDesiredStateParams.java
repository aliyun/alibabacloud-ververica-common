package com.ververica.common.params;

import com.ververica.common.model.deployment.DeploymentState;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateDeploymentDesiredStateParams {

  @NotNull DeploymentState state;
}
