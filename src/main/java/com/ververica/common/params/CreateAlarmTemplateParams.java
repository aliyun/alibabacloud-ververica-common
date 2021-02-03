package com.ververica.common.params;

import com.ververica.common.model.alarmrule.Comparators;
import com.ververica.common.model.alarmrule.NotifyRule;
import com.ververica.common.model.alarmrule.ThresholdType;
import java.util.List;
import java.util.Map;
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

  NotifyRule notifyRule;

  @Data
  public static class Rule {
    Comparators comparator;
    /**
     * There are two kinds of threshold keys, respectively: 'CRITICAL' and 'WARNING',Value is Doble
     * type
     */
    Map<ThresholdType, Double> thresholds;

    String checkInterval;
  }
}
