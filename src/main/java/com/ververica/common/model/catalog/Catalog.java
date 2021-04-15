package com.ververica.common.model.catalog;

import java.util.Map;
import lombok.Data;

@Data
public class Catalog {
  String name;
  Map<String, String> properties;
}
