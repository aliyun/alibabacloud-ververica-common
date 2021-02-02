package com.ververica.common.params;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.alarmrule.Comparators;
import com.ververica.common.model.alarmrule.NotifyRule;
import com.ververica.common.model.alarmrule.ThresholdType;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
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

  @Valid @NotEmpty List<Rule> rule;

  @Valid
  @JsonProperty("notify_rule")
  NotifyRule notifyRule;

  @Data
  public static class Rule {
    @NotNull(message = "comparator not set")
    Comparators comparator;
    /**
     * There are two kinds of threshold keys, respectively: 'CRITICAL' and 'WARNING',Value is Doble
     * type
     */
    @NotEmpty(message = "thresholds not set")
    Map<ThresholdType, Double> thresholds;

    @JsonProperty("check_interval")
    @NotBlank(message = "checkInterval not set")
    String checkInterval;
  }
}
