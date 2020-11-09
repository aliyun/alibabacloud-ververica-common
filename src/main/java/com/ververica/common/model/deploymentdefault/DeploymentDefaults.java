package com.ververica.common.model.deploymentdefault;

import com.ververica.common.model.deployment.Deployment;
import lombok.Data;

import java.util.Date;
import java.util.Map;

@Data
public class DeploymentDefaults {
  DeploymentDefaults.DeploymentDefaultsMetadata metadata;
  Deployment.DeploymentSpec spec;

  @Data
  public static class DeploymentDefaultsMetadata {
    String id;
    String name;
    String namespace;
    Date createdAt;
    Date modifiedAt;
    Map<String, String> labels;
    Map<String, String> annotations;
    Integer resourceVersion;
  }
}
