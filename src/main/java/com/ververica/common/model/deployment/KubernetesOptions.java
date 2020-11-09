package com.ververica.common.model.deployment;

import com.fasterxml.jackson.databind.JsonNode;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class KubernetesOptions {
  Pods pods;

  @Data
  public static class Pods {
    Map<String, String> annotations;
    Map<String, String> labels;
    Map<String, String> nodeSelector;
    JsonNode securityContext;
    JsonNode affinity;
    List<JsonNode> tolerations;
    List<VolumeAndMount> volumeMounts;
    List<EnvVar> envVars;
    List<LocalObjectReference> imagePullSecrets;

    @Data
    public static class VolumeAndMount {
      String name;
      JsonNode volume;
      JsonNode volumeMount;
    }

    @Data
    public static class EnvVar {
      String name;
      String value;
      JsonNode valueFrom;
    }

    @Data
    public static class LocalObjectReference {
      String name;
    }
  }
}

