package com.ververica.common.model.deploymentdefault;

import com.ververica.common.model.deployment.Deployment;
import lombok.Data;

@Data
public class GlobalDeploymentDefaults {
  Deployment.DeploymentSpec spec;
}
