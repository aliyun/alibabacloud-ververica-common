package com.ververica.common.params;

import com.ververica.common.model.autopilot.Mode;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class UpdateAutopilotPolicyParams {
  String name;
  Mode mode;
  LibraConfig libraConfig;

  @Data
  public static class LibraConfig {
    Integer cooldownMinutes;
    /**
     * Tune policy parameters (To choose more)
     * memory-utilization-based,slot-utilization-based,source-delay-based,job-exception-based
     */
    List<String> policies;

    Map<String, String> extraConfig;
    Map<String, String> metaInfo;
  }
}
