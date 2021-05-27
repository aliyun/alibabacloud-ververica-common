package com.ververica.common.resp;

import com.ververica.common.model.autopilot.AutopilotPolicy;
import lombok.Data;

@Data
public class UpdateAutopilotPolicyResp {
  AutopilotPolicy policy;
}
