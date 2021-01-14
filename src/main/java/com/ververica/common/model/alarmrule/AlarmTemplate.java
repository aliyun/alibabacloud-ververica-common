package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AlarmTemplate {

  Integer id;
  String name;
  String description;
  String service;
  String creatorId;
  String nick;
  String gmtCreate;
  Long gmtModified;
  String delayEnd;
  Integer status;
  String lastModifyNick;
  String lastModifyUser;
  String gocStatus;
  String metric;
  List<String> receivers;
  List<Rule> rule;
  String scheduleTemplateId;
  @JsonProperty("notify_rule")
  NotifyRule notifyRule;

}
