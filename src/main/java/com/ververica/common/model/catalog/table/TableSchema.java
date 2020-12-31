package com.ververica.common.model.catalog.table;

import lombok.Data;

import java.util.List;

@Data
public class TableSchema {
  List<TableColumn> columns;
  List<WatermarkSpec> watermarkSpecs;
  UniqueConstraint primaryKey;
}
