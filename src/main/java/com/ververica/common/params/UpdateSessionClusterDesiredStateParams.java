package com.ververica.common.params;

import com.ververica.common.model.sessioncluster.SessionClusterState;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class UpdateSessionClusterDesiredStateParams {

  @NotNull SessionClusterState state;
  Boolean isForceStopState;
}
