package com.ververica.common.model.catalog.table;

import lombok.Data;

import java.util.List;

/**
 * TODO: type原始类型为org.apache.flink.table.api.constraints.Constraint.ConstraintType，这里使用String代替
 */
@Data
public class UniqueConstraint {
  String name;
  List<String> columns;
  String type;
}
