package com.ververica.common.model.namespace;

public enum LifecyclePhase {

  /** <code>LIFECYCLE_PHASE_INVALID = 0;</code> */
  LIFECYCLE_PHASE_INVALID,
  /** <code>LIFECYCLE_PHASE_ACTIVE = 1;</code> */
  LIFECYCLE_PHASE_ACTIVE,
  /** <code>LIFECYCLE_PHASE_TERMINATING = 2;</code> */
  LIFECYCLE_PHASE_TERMINATING,

  UNRECOGNIZED
}
