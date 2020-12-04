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

  @Data
  public static class NotifyRule {
    String warning;
    Critical critical;
    @JsonProperty("alarm_interval")
    String alarmInterval;
    @JsonProperty("time_range")
    String timeRange;
    @JsonProperty("is_schedule")
    String isSchedule;

  }

  @Data
  public static class Critical {
    Boolean dingding;
    Boolean mail;
    Boolean sms;
  }

}
