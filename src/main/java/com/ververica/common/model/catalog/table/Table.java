package com.ververica.common.model.catalog.table;

import java.util.Map;
import lombok.Data;

@Data
public class Table {
  String name;
  TableSchema schema;
  Map<String, String> properties;
  String comment;
}
