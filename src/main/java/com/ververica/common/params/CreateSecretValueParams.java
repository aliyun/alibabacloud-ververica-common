package com.ververica.common.params;

import com.ververica.common.model.secretvalue.SecretValueSpec;
import lombok.Data;

@Data
public class CreateSecretValueParams {
  SecretValueMetadata metadata;
  SecretValueSpec spec;

  @Data
  public static class SecretValueMetadata {
    String name;
    String namespace;
  }
}
