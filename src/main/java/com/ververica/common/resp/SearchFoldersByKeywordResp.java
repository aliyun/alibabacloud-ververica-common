package com.ververica.common.resp;

import com.ververica.common.model.draft.DeploymentDraft;
import lombok.Data;

@Data
public class SearchFoldersByKeywordResp {
  String id;
  String name;
  String type;

  DeploymentDraft resource;
}
