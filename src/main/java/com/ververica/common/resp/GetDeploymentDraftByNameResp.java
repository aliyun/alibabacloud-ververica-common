package com.ververica.common.resp;

import com.ververica.common.model.draft.DeploymentDraft;
import java.util.List;
import lombok.Data;

@Data
public class GetDeploymentDraftByNameResp {
  List<DeploymentDraft> items;
}
