package com.ververica.common.model.job;

public enum JobStatusState {
  STARTING,
  STANDBY,
  STARTED,
  TERMINATING,
  FAILED,
  TERMINATED,
  FINISHED
}
