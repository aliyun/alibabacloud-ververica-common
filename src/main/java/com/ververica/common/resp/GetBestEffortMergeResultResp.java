package com.ververica.common.resp;

import com.ververica.common.model.deployment.ResourcePlan;
import lombok.Data;

@Data
public class GetBestEffortMergeResultResp extends ResourcePlan {
  String ticketStatus;
}
