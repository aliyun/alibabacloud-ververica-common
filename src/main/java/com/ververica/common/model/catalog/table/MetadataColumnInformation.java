package com.ververica.common.model.catalog.table;

import lombok.Data;

@Data
public class MetadataColumnInformation {
    String name;
    boolean virtual;
}
