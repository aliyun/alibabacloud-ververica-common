package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Rule {

  Comparators comparator;
  Thresholds  thresholds;
  @JsonProperty("check_interval")
  String checkInterval;
  String aggregator;
  @JsonProperty("compared_to")
  String comparedTo;
  String continuous;
  @JsonProperty("extend_tag")
  String extendTag;
  @JsonProperty("ds-aggregator")
  String dsAggregator;
  @JsonProperty("math_abs")
  String mathAbs;
  String nodata;
  String type;
  String operator;

}
