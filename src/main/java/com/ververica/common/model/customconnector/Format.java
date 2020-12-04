package com.ververica.common.model.customconnector;

import lombok.Data;

import java.util.List;

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
