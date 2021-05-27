package com.ververica.common.model.autopilot;

import lombok.Data;

@Data
public class AutopilotPolicy {
  String name;
  Mode mode;
  String modifyTime;
  LibraConfig libraConfig;
}
