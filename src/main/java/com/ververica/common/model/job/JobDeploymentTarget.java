package com.ververica.common.model.job;

import com.ververica.common.model.deploymenttarget.KubernetesTarget;
import lombok.Data;

@Data
public class JobDeploymentTarget {
  KubernetesTarget kubernetes;
  String storageUri;
  String zookeeperEndpoint;
}
