package com.ververica.common.params;

import lombok.Data;

import javax.validation.constraints.NotNull;

/**
 * Copy a savepoint from the given location
 * ONLY when flinkSavepointId and flinkSavepointId are BOTH present
 */
@Data
public class CreateSavepointParams {

  @NotNull
  String deploymentId;

  String flinkSavepointId;
  String savepointLocation;
}
