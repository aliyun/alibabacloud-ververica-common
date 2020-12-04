package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import lombok.Data;

@Data
public class AlarmOptions {

  List<String> metrics;
  List<String> notifyWays;

  @JsonProperty("ds-aggregators")
  List<String> dsAggregators;

  List<Comparators> comparators;
}
