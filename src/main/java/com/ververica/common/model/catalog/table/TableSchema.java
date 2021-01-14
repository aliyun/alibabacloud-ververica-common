package com.ververica.common.model.catalog.table;

import java.util.List;
import lombok.Data;

@Data
public class TableSchema {
  List<TableColumn> columns;
  List<WatermarkSpec> watermarkSpecs;
  UniqueConstraint primaryKey;
}
