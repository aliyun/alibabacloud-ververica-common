package com.ververica.common.model.customconnector;

import lombok.Data;

import java.util.List;
@Data
public class Format {
    String name;
    String type;
    boolean packaged;
    boolean source;
    boolean sink;
    List<Properties> properties;
    List<String> dependencies;

}
