package com.ververica.common.model.customconnector;

import lombok.Data;

import java.util.List;

@Data
public class Connector {

  String name;
  String type;
  Boolean packaged;
  Boolean source;
  Boolean sink;
  Boolean lookup;
  List<Properties> properties;
  Boolean requiredFormat;
  List<String> supportedFormats;
  List<String> dependencies;

}
