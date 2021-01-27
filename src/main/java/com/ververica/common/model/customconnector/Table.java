package com.ververica.common.model.customconnector;

import lombok.Data;

@Data
public class Table {
  String catalogName;
  String databaseName;
  String tableName;
}
