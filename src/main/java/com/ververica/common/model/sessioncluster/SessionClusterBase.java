package com.ververica.common.model.sessioncluster;

import com.ververica.common.model.logging.Logging;
import com.ververica.common.model.resource.ResourceSpec;
import java.util.Date;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class SessionClusterBase {

  @Valid SessionClusterMetadata metadata;
  @Valid SessionClusterSpec spec;

  @Data
  public static class SessionClusterMetadata {
    String id;

    @NotBlank(message = "name not set")
    String name;

    String namespace;
    Date createdAt;
    Date modifiedAt;
    Map<String, String> labels;
    Map<String, String> annotations;
  }

  @Data
  public static class SessionClusterSpec {
    SessionClusterState state;
    String deploymentTargetName;

    @NotBlank(message = "flinkVersion not set")
    String flinkVersion;

    String flinkImageRegistry;
    String flinkImageRepository;

    @NotBlank(message = "flinkImageTag not set")
    String flinkImageTag;

    Integer numberOfTaskManagers;

    @NotEmpty(message = "resources not set")
    Map<String, ResourceSpec> resources;

    Map<String, String> flinkConfiguration;

    @NotNull(message = "logging not set")
    Logging logging;

    Kubernetes kubernetes;
  }
}
