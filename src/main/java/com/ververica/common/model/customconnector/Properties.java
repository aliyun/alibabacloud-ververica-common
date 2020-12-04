package com.ververica.common.model.customconnector;

import lombok.Data;

@Data
public class Properties {
  String key;
  Boolean required;
  String defaultValue;
  String description;
}
