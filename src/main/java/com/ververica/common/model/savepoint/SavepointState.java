package com.ververica.common.model.savepoint;

/** Different Savepoint states. */
public enum SavepointState {
  /** Savepoint in progress. */
  STARTED,

  /** Savepoint finished. */
  COMPLETED,

  /** Savepoint couldn't be created. */
  FAILED
}
