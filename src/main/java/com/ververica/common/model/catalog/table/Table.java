package com.ververica.common.model.catalog.table;

import lombok.Data;

import java.util.Map;

@Data
public class Table {
  String name;
  TableSchema schema;
  Map<String, String> properties;
  String comment;
}
