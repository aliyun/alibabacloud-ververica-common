package com.ververica.common.params;

import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * Copy a savepoint from the given location ONLY when flinkSavepointId and flinkSavepointId are BOTH
 * present
 */
@Data
public class CreateSavepointParams {

  @NotNull String deploymentId;

  String flinkSavepointId;
  String savepointLocation;
}
