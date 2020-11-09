package com.ververica.common.model.deploymenttarget;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class KubernetesTarget {
  @NotNull String namespace;
}
