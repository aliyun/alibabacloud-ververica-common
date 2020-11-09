package com.ververica.common.util;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.DatabindContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.impl.TypeIdResolverBase;
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

public class PolymorphicResolver extends TypeIdResolverBase {
  private final BiMap<String, Class<?>> subTypes = HashBiMap.create();
  private JavaType superType;
  private Class<?> defaultClass;

  protected void bind(String kind, Class<?> subClass) {
    subTypes.put(kind.toUpperCase(), subClass);
  }

  protected void bindDefault(Class<?> defaultClass) {
    this.defaultClass = defaultClass;
  }

  @Override
  public void init(JavaType baseType) {
    superType = baseType;
  }

  @Override
  public JsonTypeInfo.Id getMechanism() {
    return JsonTypeInfo.Id.NAME;
  }

  @Override
  public String idFromValue(Object obj) {
    return kindFromSubtype(obj);
  }

  @Override
  public String idFromValueAndType(Object obj, Class<?> subType) {
    return kindFromSubtype(obj);
  }

  @Override
  public JavaType typeFromId(DatabindContext context, String id) {
    Class<?> subType = subTypeFromKind(id);
    return context.constructSpecializedType(superType, subType);
  }

  private String kindFromSubtype(Object obj) {
    Class<?> subType = obj.getClass();
    return subTypes.inverse().get(subType);
  }

  private Class<?> subTypeFromKind(String id) {
    Class<?> subType = subTypes.get(id.toUpperCase());
    if (subType != null) {
      return subType;
    }
    return defaultClass;
  }
}

