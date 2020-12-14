package com.ververica.common.model.customconnector;

import lombok.Data;

import java.util.List;
@Data
public class Connector {
         String name;
         String type;
         boolean packaged;
         boolean source;
         boolean sink;
         boolean lookup;
         List<Properties> properties;
         boolean requiredFormat;
         List<String> supportedFormats;
         List<String> dependencies;



}
