package com.ververica.common.model.catalog.database;

import lombok.Data;

import java.util.Map;

@Data
public class Database {

  String name;
  Map<String, String> properties;
  String comment;
}
