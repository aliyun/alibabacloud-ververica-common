package com.ververica.common.params;

import com.ververica.common.model.deployment.*;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateDeploymentDesiredStateParams {

  @NotNull DeploymentState state;
  StartParamBase startParamBase;
}
