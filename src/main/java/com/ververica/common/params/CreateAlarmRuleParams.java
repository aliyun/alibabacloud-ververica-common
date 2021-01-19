package com.ververica.common.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.alarmrule.Comparators;
import com.ververica.common.model.alarmrule.NotifyRule;
import com.ververica.common.model.alarmrule.Thresholds;
import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreateAlarmRuleParams {
  @NotBlank(message = "name not set")
  String name;

  @NotBlank(message = "description not set")
  String description;

  @NotBlank(message = "metric not set")
  String metric;
  /** This is the ID of the contact group */
  List<String> receivers;

  @NotEmpty
  List<Rule> rule;

  @JsonProperty("notify_rule")
  NotifyRule notifyRule;

  @Data
  public static class Rule {
    Comparators comparator;
    Thresholds thresholds;

    @JsonProperty("check_interval")
    @NotBlank(message = "checkInterval not set")
    String checkInterval;
  }
}
