package com.ververica.common.model.draft;

import com.ververica.common.model.catalog.table.VvpReferencedTable;
import java.util.List;
import lombok.Data;

/** Result for DeploymentDraft validation. */
@Data
public class DraftValidationResult {

  /** Validation result, true or false */
  Boolean success;

  /** Message to describe more details. */
  String message;

  /** Artifact kind, e.g. JAR, SQLSCRIPT, PYTHON */
  String kind;

  /** The draft validation result. */
  DraftValidation draftValidation;

  /** The plan validation result. */
  PlanValidationResult planValidation;

  /** The artifact validation. */
  Object artifactValidation;

  /** The source tables */
  List<VvpReferencedTable> sources;

  /** The sink tables */
  List<VvpReferencedTable> sinks;
}
