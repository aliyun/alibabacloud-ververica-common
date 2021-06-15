package com.ververica.common.params;

import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.ververica.common.model.resource.ResourceSpec;
import com.ververica.common.util.Polymorphic;
import com.ververica.common.util.PolymorphicResolver;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@JsonTypeIdResolver(DeploymentResourceModeBase.TypeResolver.class)
public interface DeploymentResourceModeBase extends Polymorphic {
  @Data
  class WithAuto implements DeploymentResourceModeBase {
    public static final String MODE_TYPE = "auto";
    String kind = MODE_TYPE;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class WithFineGrained implements DeploymentResourceModeBase {
    public static final String MODE_TYPE = "fine-grained";
    String kind = MODE_TYPE;

    @NotBlank(message = "content not set")
    String content;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class WithCoarseGrained implements DeploymentResourceModeBase {
    public static final String MODE_TYPE = "coarse-grained";
    String kind = MODE_TYPE;
    Integer parallelism;
    ResourceSpec jobManager;
    ResourceSpec taskManager;
    Boolean isSetNativeKubernetesMode = null;

    @Override
    public void setKind(String ignored) {}
  }

  final class TypeResolver extends PolymorphicResolver {
    public TypeResolver() {
      bind(
          DeploymentResourceModeBase.WithAuto.MODE_TYPE, DeploymentResourceModeBase.WithAuto.class);
      bind(
          DeploymentResourceModeBase.WithFineGrained.MODE_TYPE,
          DeploymentResourceModeBase.WithFineGrained.class);
      bind(
          DeploymentResourceModeBase.WithCoarseGrained.MODE_TYPE,
          DeploymentResourceModeBase.WithCoarseGrained.class);
    }
  }
}
