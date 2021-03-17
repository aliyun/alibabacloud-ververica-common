package com.ververica.common.model.catalog;

import lombok.Data;

import java.util.Map;

@Data
public class Catalog {
  String name;
  Map<String, String> properties;
}
