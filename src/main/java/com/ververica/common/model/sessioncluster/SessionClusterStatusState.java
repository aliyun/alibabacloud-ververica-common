package com.ververica.common.model.sessioncluster;

public enum SessionClusterStatusState {
  STOPPED,

  STARTING,

  RUNNING,

  UPDATING,

  STOPPING,

  FAILED,

  FORCESTOP;

  public boolean isTerminal() {
    return this == STOPPED || this == FAILED;
  }
}
