package com.ververica.common.params;

import com.ververica.common.model.deployment.*;
import java.util.Map;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateDeploymentDesiredStateParams {

  @NotNull DeploymentState state;

  DeploymentMetadata metadata;
  DeploymentSpec spec;

  @Data
  public static class DeploymentMetadata {
    Map<String, String> annotations;
  }

  @Data
  public static class DeploymentSpec {
    DeploymentRestoreStrategy restoreStrategy;
    DeploymentTemplate template;

    @Data
    public static class DeploymentTemplate {
      Deployment.DeploymentSpec.DeploymentTemplate.DeploymentTemplateMetadata metadata;
    }
  }
}
