package com.ververica.common.params;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateDeploymentTargetParams {
  @NotNull String name;
  @NotNull String kubernetesNamespace;
  String storageUri;
  String zookeeperEndpoint;
  String clusterName;
  String engineCompatibility;
}
