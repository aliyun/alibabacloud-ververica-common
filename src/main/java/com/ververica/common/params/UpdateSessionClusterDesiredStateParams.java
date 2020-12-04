package com.ververica.common.params;

import com.ververica.common.model.sessioncluster.SessionClusterState;
import lombok.Data;

import javax.validation.constraints.NotNull;
@Data
public class UpdateSessionClusterDesiredStateParams  {

  @NotNull
  SessionClusterState state;

}
