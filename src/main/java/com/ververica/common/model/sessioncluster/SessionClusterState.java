package com.ververica.common.model.sessioncluster;

public enum SessionClusterState {

  STOPPED,

  STARTING,

  RUNNING,

  UPDATING,

  STOPPING,

  FAILED;

  public boolean isTerminal() {
    return this == STOPPED || this == FAILED;
  }


}
