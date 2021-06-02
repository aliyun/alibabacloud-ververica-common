package com.ververica.common.params;

import com.fasterxml.jackson.databind.annotation.JsonTypeIdResolver;
import com.ververica.common.util.Polymorphic;
import com.ververica.common.util.PolymorphicResolver;
import javax.validation.constraints.NotNull;
import lombok.Data;

@JsonTypeIdResolver(StartParamBase.TypeResolver.class)
public interface StartParamBase extends Polymorphic {

  @Data
  class WithOffset implements StartParamBase {
    public static final String START_TYPE = "WITH_START_OFFSET";
    String kind = START_TYPE;

    @NotNull Long timestamp;

    @Override
    public void setKind(String ignored) {}
  }

  @Data
  class WithNoneState implements StartParamBase {
    public static final String START_TYPE = "WITH_NONE_STATE";
    String kind = START_TYPE;

    @Override
    public void setKind(String ignored) {}
  }

  final class TypeResolver extends PolymorphicResolver {
    public TypeResolver() {
      bind(WithOffset.START_TYPE, WithOffset.class);
      bind(WithNoneState.START_TYPE, WithNoneState.class);
    }
  }
}
