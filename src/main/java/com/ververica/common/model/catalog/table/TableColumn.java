package com.ververica.common.model.catalog.table;

import lombok.Data;

/** TODO: TYPE原始类型为org.apache.flink.table.types.DataType，使用String代替 */
@Data
public class TableColumn {
  String name;
  String type;
  String expression;
  MetadataColumnInformation meta;
}
