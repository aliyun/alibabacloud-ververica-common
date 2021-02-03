package com.ververica.common.model.deploymenttarget;

import lombok.Data;

@Data
public class KubernetesTarget {
  String namespace;
  String clusterName;
}
