package com.ververica.common.model.deploymenttarget;

/** The current state of a deployment target. */
public enum DeploymentTargetState {

  /** The deployment target is running. */
  ONLINE,

  /** The deployment target has been closed. */
  OFFLINE
}
