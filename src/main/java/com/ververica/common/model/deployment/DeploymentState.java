package com.ververica.common.model.deployment;

public enum DeploymentState {

  /**
   * The deployment has one running job.
   */
  RUNNING,

  /**
   * The deployment hasn't any running job. A savepoint has been taken and the deployment will
   * resume from the savepoint when transitioning back to RUNNING state
   */
  SUSPENDED,

  /**
   * The deployment hasn't any running job. No savepoint has been taken.
   */
  CANCELLED
}
