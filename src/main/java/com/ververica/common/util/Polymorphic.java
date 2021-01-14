package com.ververica.common.util;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.EXISTING_PROPERTY,
    property = "kind",
    visible = true)
public interface Polymorphic {
  String getKind();

  /**
   * This is an unused setter to overcome an issue with Jackson when we use it with subtypes,
   * JsonTypeInfo.As.EXISTING_PROPERTY, and DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES which
   * causes Jackson to fail deserializing polymorphic types.
   */
  void setKind(String ignored);

  /**
   * Cast this method as an instance of a given class.
   *
   * <p>A convenience method for inline casting.
   */
  @JsonIgnore
  default <T> T as(Class<T> klass) {
    if (!klass.isInstance(this)) {
      throw new IllegalArgumentException("Wrong kind " + getKind());
    }
    return klass.cast(this);
  }
}
