package com.ververica.common.model.ui;

import lombok.Data;

import java.util.Map;

@Data
public class GetDynamicIndicators {
  Map<String, Object> metricsMap;
  String metrics;
  String sessionClusterFlinkUi;
  String flinkUi;
}
