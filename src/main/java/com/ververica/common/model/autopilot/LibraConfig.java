package com.ververica.common.model.autopilot;

import java.util.Map;
import lombok.Data;

@Data
public class LibraConfig {
  Integer cooldownMinutes;
  String policies;
  Map<String, String> extraConfig;
  Map<String, String> metaInfo;
}
