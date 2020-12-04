package com.ververica.common.model.deployment;

import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.ververica.common.util.Polymorphic;
import com.ververica.common.util.PolymorphicResolver;
import lombok.Data;

@JsonTypeIdResolver(DeploymentUpgradeStrategy.TypeResolver.class)
public interface DeploymentUpgradeStrategy extends Polymorphic {

  /** The deployment WILL take a savepoint before upgrading. It will resume from this savepoint. */
  @Data
  class StatefulDeploymentUpgrade implements DeploymentUpgradeStrategy {
    public static final String KIND = "STATEFUL";
    String kind = KIND;

    @Override
    public void setKind(String ignored) {}
  }

  /** The deployment WILL NOT take any savepoint before upgrading. */
  @Data
  class StatelessDeploymentUpgrade implements DeploymentUpgradeStrategy {
    public static final String KIND = "STATELESS";

    String kind = KIND;

    @Override
    public void setKind(String ignored) {}
  }

  /** The deployment WILL NOT upgrade. */
  @Data
  class NoDeploymentUpgrade implements DeploymentUpgradeStrategy {
    public static final String KIND = "NONE";

    String kind = KIND;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class UnspecifiedDeploymentUpgrade implements DeploymentUpgradeStrategy {
    String kind;

    @Override
    public void setKind(String ignored) {}
  }

  final class TypeResolver extends PolymorphicResolver {
    public TypeResolver() {
      bind(StatefulDeploymentUpgrade.KIND, StatefulDeploymentUpgrade.class);
      bind(StatelessDeploymentUpgrade.KIND, StatelessDeploymentUpgrade.class);
      bind(NoDeploymentUpgrade.KIND, NoDeploymentUpgrade.class);
      bindDefault(UnspecifiedDeploymentUpgrade.class);
    }
  }
}
