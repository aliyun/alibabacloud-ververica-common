package com.ververica.common.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.alarmrule.Comparators;
import com.ververica.common.model.alarmrule.NotifyRule;
import com.ververica.common.model.alarmrule.Thresholds;
import lombok.Data;
import java.util.List;

@Data
public class CreateAlarmTemplateParams {
  String name;
  String description;
  String metric;
  /**
   * This is the ID of the contact group
   */
  List<String> receivers;
  List<Rule> rule;
  @JsonProperty("notify_rule")
  NotifyRule notifyRule;
  @Data
  public static class Rule{
     Comparators comparator;
     Thresholds thresholds;
     @JsonProperty("check_interval")
     String checkInterval;
  }

}
