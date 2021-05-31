package com.ververica.common.model.deployment;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.ververica.common.util.Polymorphic;
import com.ververica.common.util.PolymorphicResolver;
import lombok.Data;

@JsonTypeIdResolver(DeploymentRestoreStrategy.TypeResolver.class)
public interface DeploymentRestoreStrategy extends Polymorphic {

  @Data
  class None implements DeploymentRestoreStrategy {
    public static final String KIND = "NONE";
    String kind = KIND;
    @JsonInclude Boolean allowNonRestoredState;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class LatestSavepoint implements DeploymentRestoreStrategy {
    public static final String KIND = "LATEST_SAVEPOINT";
    String kind = KIND;
    Boolean allowNonRestoredState;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class LatestState implements DeploymentRestoreStrategy {
    public static final String KIND = "LATEST_STATE";
    String kind = KIND;
    Boolean allowNonRestoredState;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class Unspecified implements DeploymentRestoreStrategy {
    String kind;

    @Override
    public void setKind(String ignored) {}
  }

  final class TypeResolver extends PolymorphicResolver {
    public TypeResolver() {
      bind(None.KIND, None.class);
      bind(LatestSavepoint.KIND, LatestSavepoint.class);
      bind(LatestState.KIND, LatestState.class);
      bindDefault(Unspecified.class);
    }
  }
}
