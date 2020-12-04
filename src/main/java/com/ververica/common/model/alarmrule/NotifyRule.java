package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class NotifyRule {
  /** This is the alarm interval，Supports 1 day and 1 minute */
  @JsonProperty("alarm_interval")
  AlarmInterval alarmInterval;
  /** This is the effective time, e.d."0:0-23:59" */
  @JsonProperty("time_range")
  String timeRange;
  /** This is the Inform the way */
  Critical critical;
}
