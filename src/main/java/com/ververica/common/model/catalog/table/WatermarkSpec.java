package com.ververica.common.model.catalog.table;

import lombok.Data;

/**
 * TODO:
 * watermarkExprOutputType: 原本类型为org.apache.flink.table.types.DataType, 此处使用String代替
 */
@Data
public class WatermarkSpec {
  String rowtimeAttribute;
  String watermarkExpressionString;
  String watermarkExprOutputType;
}
