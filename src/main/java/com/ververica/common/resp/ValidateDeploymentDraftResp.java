package com.ververica.common.resp;

import com.ververica.common.model.draft.ArtifactValidation;
import com.ververica.common.model.draft.DraftValidation;
import lombok.Data;

@Data
public class ValidateDeploymentDraftResp {
  ArtifactValidation artifactValidation;
  DraftValidation draftValidation;
  String kind;
  Boolean success;
  String message;
}
