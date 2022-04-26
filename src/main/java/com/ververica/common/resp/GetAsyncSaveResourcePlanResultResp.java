package com.ververica.common.resp;

import lombok.Data;

@Data
public class GetAsyncSaveResourcePlanResultResp extends SaveDeploymentDraftResourcePlanResp {
  String ticketStatus;
}
