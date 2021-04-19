package com.ververica.common.params;

import com.ververica.common.model.deployment.Artifact;
import lombok.Data;

@Data
public class CreateDeploymentDraftParams {
  DeploymentDraftMetadata metadata;
  DeploymentDraftSpec spec;

  @Data
  public static class DeploymentDraftMetadata {
    String parentId;
    String name;
  }

  @Data
  public static class DeploymentDraftSpec {
    String deploymentTargetId;
    String sessionClusterName;
    DeploymentDraftTemplate template;

    @Data
    public static class DeploymentDraftTemplate {
      DeploymentDraftTemplateSpec spec;

      @Data
      public static class DeploymentDraftTemplateSpec {

        Artifact artifact;

        Boolean batchMode;

        @Data
        public static class JarArtifact implements Artifact {
          public static final String KIND = "JAR";
          String kind = KIND;

          @Override
          public void setKind(String ignored) {}
        }

        @Data
        public static class SqlScriptArtifact implements Artifact {
          public static final String KIND = "SQLSCRIPT";
          String kind = KIND;
          String sqlScript;

          @Override
          public void setKind(String ignored) {}
        }

        @Data
        public static class UnknownArtifact implements Artifact {
          String kind;

          @Override
          public void setKind(String ignored) {}
        }
      }
    }
  }
}
