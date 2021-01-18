package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AlarmRule {

  @NotNull String name;
  @NotNull String description;
  @NotNull String metric;
  Integer status;
  Long id;
  List<String> receivers;
  List<Rule> rule;

  @JsonProperty("notify_rule")
  NotifyRule notifyRule;

  Long gmtCreate;
  Long gmtModified;
  Date delayEnd;
  Long scheduleTemplateId;
}
