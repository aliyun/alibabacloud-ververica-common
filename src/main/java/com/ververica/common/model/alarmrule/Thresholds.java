package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Thresholds {
  @JsonProperty("CRITICAL")
  Double critical;
}
