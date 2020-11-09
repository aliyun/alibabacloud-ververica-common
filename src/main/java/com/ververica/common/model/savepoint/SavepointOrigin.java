package com.ververica.common.model.savepoint;

import com.fasterxml.jackson.annotation.JsonEnumDefaultValue;

public enum SavepointOrigin {
  /**
   * The savepoint has been requested by the user.
   */
  USER_REQUEST,

  /**
   * The savepoint has been requested for an upgrade with SUSPEND_AND_UPGRADE mode.
   */
  SUSPEND_AND_UPGRADE,

  /**
   * The savepoint has been requested when the user suspended the deployment.
   */
  SUSPEND,

  /**
   * The savepoint has been copied.
   */
  @JsonEnumDefaultValue
  COPIED,

  /**
   * A Flink checkpoint that is retained after the Flink job has terminated.
   */
  RETAINED_CHECKPOINT;
}
