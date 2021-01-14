package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;


@Data
public class AlarmRule {

  @NotNull String name;
  @NotNull String description;
  @NotNull String metric;
  Integer status;
  Integer id;
  List<String> receivers;
  List<Rule> rule;
  @JsonProperty("notify_rule")
  NotifyRule notifyRule;
  Long gmtCreate;
  Long gmtModified;
  Date delayEnd;
  Long scheduleTemplateId;


}
