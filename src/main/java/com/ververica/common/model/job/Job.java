package com.ververica.common.model.job;

import com.ververica.common.model.Failure;
import com.ververica.common.model.deployment.Artifact;
import com.ververica.common.model.deployment.KubernetesOptions;
import com.ververica.common.model.logging.Logging;
import com.ververica.common.model.resource.ResourceSpec;
import java.net.URI;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class Job {
  JobMetadata metadata;
  JobSpec spec;
  JobStatus status;

  @Data
  public static class JobMetadata {
    String id;
    String namespace;
    Date createdAt;
    Date modifiedAt;
    Date terminatedAt;
    String deploymentId;
    String deploymentName;
    Map<String, String> annotations;
    Integer resourceVersion;
  }

  @Data
  public static class JobSpec {
    URI savepointLocation;
    boolean allowNonRestoredState;
    Integer parallelism;
    Integer numberOfTaskManagers;
    Artifact artifact;
    Logging logging;
    Map<String, String> flinkConfiguration;
    Map<String, ResourceSpec> resources;
    KubernetesOptions kubernetes;

    JobDeploymentTarget deploymentTarget;

    Map<String, String> secretValues;
  }

  @Data
  public static class JobStatus {
    JobStatusState state;
    Failure failure;
    JobStatusStarted started;
  }
}
