package com.ververica.common.model.catalog.table;

import java.util.List;
import lombok.Data;

@Data
public class TableSchema {
  List<TableColumn> column;
  List<WatermarkSpec> watermarkSpec;
  UniqueConstraint primaryKey;
}
