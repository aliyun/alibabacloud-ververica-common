package com.ververica.common.resp;

import lombok.Data;

@Data
public class GetAsyncBestEffortMergeResultResp
    extends GetDeploymentDraftResourcePlanWithBestEffortResp {
  String ticketStatus;
}
