package com.ververica.common.model.deploymenttarget;

import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.ververica.common.util.Polymorphic;
import com.ververica.common.util.PolymorphicResolver;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class DeploymentTarget {
  DeploymentTargetMetadata metadata;
  DeploymentTargetSpec spec;

  @Data
  public static class DeploymentTargetMetadata {
    String id;
    String name;
    String namespace;
    Date createdAt;
    Date modifiedAt;
    Map<String, String> annotations;
    Map<String, String> labels;
    Integer resourceVersion;
  }

  @JsonTypeIdResolver(DeploymentTargetSpec.Resolver.class)
  public interface DeploymentTargetSpec extends Polymorphic {

    @Data
    class Yarn implements DeploymentTargetSpec {
      public static final String KIND = "yarn";

      String kind = KIND;
      YarnTarget yarn;
      DeploymentTargetState state = DeploymentTargetState.ONLINE;

      @Override
      public void setKind(String ignored) {}
    }

    @Data
    class Kubernetes implements DeploymentTargetSpec {
      public static final String KIND = "kubernetes";

      String kind = KIND;
      KubernetesTarget kubernetes;
      String storageUri;
      String zookeeperEndpoint;
      DeploymentTargetState state = DeploymentTargetState.ONLINE;

      @Override
      public void setKind(String ignored) {}
    }

    class Resolver extends PolymorphicResolver {
      public Resolver() {
        bind(Kubernetes.KIND, Kubernetes.class);
        bind(Yarn.KIND, Yarn.class);
        bindDefault(Kubernetes.class);
      }
    }
  }
}
