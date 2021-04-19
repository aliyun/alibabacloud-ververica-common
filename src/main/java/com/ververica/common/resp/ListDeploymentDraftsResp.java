package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.PageMetadata;
import com.ververica.common.model.draft.DeploymentDraft;
import java.util.List;
import lombok.Data;

@Data
public class ListDeploymentDraftsResp {
  List<DeploymentDraft> items;

  @JsonProperty("metadata")
  PageMetadata pageMetadata;
}
