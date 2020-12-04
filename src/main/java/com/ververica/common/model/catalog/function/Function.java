package com.ververica.common.model.catalog.function;

import lombok.Data;

/** TODO: functionLanguage原始类型为org.apache.flink.table.catalog.FunctionLanguage，使用String代替 */
@Data
public class Function {
  String name;
  String className;
  String functionLanguage;
  String functionType;
  String description;
}
