package com.ververica.common.model.draft;

import lombok.Data;

@Data
public class DraftDeployResult {
  Boolean success;

  String message;

  DraftValidationResult validationResult;

  DraftCommitResult commitResult;

  DraftHistoryResult draftHistoryResult;
}
