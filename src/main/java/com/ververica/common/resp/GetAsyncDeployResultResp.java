package com.ververica.common.resp;

import lombok.Data;

@Data
public class GetAsyncDeployResultResp extends DeployDeploymentDraftResp {
  String ticketStatus;
}
