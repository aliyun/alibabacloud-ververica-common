package com.ververica.common.resp;

import com.ververica.common.model.draft.DraftDeployResult;
import lombok.Data;

@Data
public class GetDeployDeploymentDraftResultResp extends DraftDeployResult {
  String ticketStatus;
}
