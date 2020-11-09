package com.ververica.common.params;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class CreateDeploymentTargetParams {
  @NotNull
  String name;
  @NotNull
  String kubernetesNamespace;
}
