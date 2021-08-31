package com.ververica.common.model.catalog.table;

import lombok.Data;

@Data
public class VvpReferencedTable {
  String catalogName;
  String databaseName;
  Table table;
  Boolean temporary;
}
