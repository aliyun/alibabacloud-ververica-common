package com.ververica.common.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.alarmrule.Comparators;
import com.ververica.common.model.alarmrule.NotifyRule;
import com.ververica.common.model.alarmrule.Thresholds;
import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateAlarmTemplateParams {
  @NotBlank(message = "name not set")
  String name;

  String description;
  String metric;
  /** This is the ID of the contact group */
  List<String> receivers;

  List<Rule> rule;

  @JsonProperty("notify_rule")
  NotifyRule notifyRule;

  @Data
  public static class Rule {
    Comparators comparator;
    Thresholds thresholds;

    @JsonProperty("check_interval")
    String checkInterval;
  }
}
