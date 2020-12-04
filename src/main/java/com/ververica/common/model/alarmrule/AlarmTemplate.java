package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AlarmTemplate {

     int id;
     String name;
     String description;
     String service;
     String creatorId;
     String nick;
     String gmtCreate;
     long gmtModified;
     String delayEnd;
     int status;
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
   public static  class NotifyRule{
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
    public static class Critical{
        boolean dingding;
        boolean mail;
        boolean sms;
    }

}
