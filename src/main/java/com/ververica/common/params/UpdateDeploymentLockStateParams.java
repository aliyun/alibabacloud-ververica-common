package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateDeploymentLockStateParams {

  // locked or unlocked
  String lockState;

  public static enum DeploymentLockState {
  locked,
  unlocked,

  }
}
