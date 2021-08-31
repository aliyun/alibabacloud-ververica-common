package com.ververica.common.model.draft;

import com.ververica.common.model.deployment.Deployment;
import lombok.Data;

@Data
public class DraftCommitResult {
  Boolean success;

  String message;

  Deployment deployment;
}
