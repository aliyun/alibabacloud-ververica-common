package com.ververica.common.model.draft;

import com.ververica.common.model.deployment.Deployment;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class DeploymentDraft {

  DeploymentDraftMetadata metadata;
  Deployment.DeploymentSpec spec;

  @Data
  public static class DeploymentDraftMetadata {
    String id;
    String name;
    String namespace;
    String parentId;
    Date createdAt;
    Date modifiedAt;
    Map<String, String> labels;
    Map<String, String> annotations;
    Integer resourceVersion;
    String description;
    Lock lock;
  }
}
