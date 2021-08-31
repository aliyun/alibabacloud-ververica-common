package com.ververica.common.model.draft;

import lombok.Data;

/** Result for DeploymentDraftHistory validation. */
@Data
public class DraftHistoryResult {

  /** Validation result, true or false */
  Boolean success;

  /** Message to describe more details. */
  String message;

  /** draft history error reason. */
  DraftHistoryErrorReason reason;

  /** draft history */
  DeploymentDraftHistory deploymentDraftHistory;
}
