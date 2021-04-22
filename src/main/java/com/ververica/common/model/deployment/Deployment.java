package com.ververica.common.model.deployment;

import com.ververica.common.model.logging.Logging;
import com.ververica.common.model.resource.ResourceSpec;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

@Data
public class Deployment {

  DeploymentMetadata metadata;
  DeploymentSpec spec;
  DeploymentStatus status;

  @Data
  public static class DeploymentMetadata {

    String id;
    String name;
    String namespace;

    Date createdAt;
    Date modifiedAt;
    Map<String, String> labels;
    Map<String, String> annotations;
    Integer resourceVersion;
  }

  @Data
  public static class DeploymentSpec {
    String sessionClusterName;
    DeploymentState state;
    DeploymentUpgradeStrategy upgradeStrategy;
    DeploymentRestoreStrategy restoreStrategy;
    String deploymentTargetId;

    Integer maxSavepointCreationAttempts;
    Integer maxJobCreationAttempts;

    DeploymentTemplate template;

    @Data
    public static class DeploymentTemplate {

      DeploymentTemplateMetadata metadata;
      DeploymentTemplateSpec spec;

      @Data
      public static class DeploymentTemplateMetadata {

        Map<String, String> annotations;
      }

      @Data
      public static class DeploymentTemplateSpec {

        Artifact artifact;
        Integer parallelism;
        Integer numberOfTaskManagers;
        Map<String, ResourceSpec> resources;
        Map<String, String> flinkConfiguration;
        Logging logging;
        Boolean batchMode;
        KubernetesOptions kubernetes;
      }
    }
  }

  @Data
  public static class DeploymentStatus {

    DeploymentStatusState state;
    DeploymentStatusRunning running;
  }
}
