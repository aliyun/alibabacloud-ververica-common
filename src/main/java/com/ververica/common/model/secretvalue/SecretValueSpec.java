package com.ververica.common.model.secretvalue;

import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.ververica.common.util.Polymorphic;
import com.ververica.common.util.PolymorphicResolver;
import lombok.Data;

@JsonTypeIdResolver(SecretValueSpec.TypeResolver.class)
public interface SecretValueSpec extends Polymorphic {
  @Data
  class PlainSecretValue implements SecretValueSpec {
    public static final String KIND = "Plain";
    String kind = KIND;
    String value;

    @Override
    public void setKind(String ignored) {}
  }

  final class TypeResolver extends PolymorphicResolver {
    public TypeResolver() {
      bind(SecretValueSpec.PlainSecretValue.KIND, SecretValueSpec.PlainSecretValue.class);
    }
  }
}
