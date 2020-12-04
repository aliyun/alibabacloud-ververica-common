package com.ververica.common.model.catalog.table;

import lombok.Data;

import java.util.List;

@Data
public class TableSchema {
  @Deprecated
  List<TableColumn> columns;
  @Deprecated
  List<WatermarkSpec> watermarkSpecs;
  List<TableColumn> column;
  List<WatermarkSpec> watermarkSpec;
  UniqueConstraint primaryKey;
}
