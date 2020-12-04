package com.ververica.common.model.deploymenttarget;

import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class KubernetesTarget {
  @NotNull String namespace;
}
