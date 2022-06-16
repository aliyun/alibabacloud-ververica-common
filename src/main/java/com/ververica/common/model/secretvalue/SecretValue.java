package com.ververica.common.model.secretvalue;

import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class SecretValue {
  SecretValueMetadata metadata;
  SecretValueSpec spec;

  @Data
  public static class SecretValueMetadata {
    String name;
    String namespace;
    Date createdAt;
    Date modifiedAt;
    Integer resourceVersion;
    Map<String, String> labels;
    Map<String, String> annotations;
  }
}
