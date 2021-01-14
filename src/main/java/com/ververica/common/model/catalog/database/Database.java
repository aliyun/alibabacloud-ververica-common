package com.ververica.common.model.catalog.database;

import java.util.Map;
import lombok.Data;

@Data
public class Database {

  String name;
  Map<String, String> properties;
  String comment;
}
