package com.ververica.common.model.sessioncluster;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class Kubernetes {
  Pod pods;

  @Data
  public static class Pod {
    Map<String, String> nodeSelector;
    List<Toleration> tolerations;

    @Data
    public static class Toleration {
      String key;
      String operator;
      String value;
      String effect;
    }
  }
}
