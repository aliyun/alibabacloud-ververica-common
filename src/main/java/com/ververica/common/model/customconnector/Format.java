package com.ververica.common.model.customconnector;

import java.util.List;
import lombok.Data;

@Data
public class Format {

  String name;
  String type;
  Boolean packaged;
  Boolean source;
  Boolean sink;
  List<Properties> properties;
  List<String> dependencies;
}
