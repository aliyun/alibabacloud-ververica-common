package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
@Valid
public class NotifyRule {
  /** This is the alarm interval，Supports 1 day and 1 minute,The parameter must be '1' or '1440' */
  @JsonProperty("alarm_interval")
  @NotBlank(message = "alarm_interval not set")
  String alarmInterval;
  /** This is the effective time, e.d."0:0-23:59" */
  @JsonProperty("time_range")
  @NotBlank(message = "time_range not set")
  String timeRange;
  /** This is the Inform the way */
  Critical critical;
}
