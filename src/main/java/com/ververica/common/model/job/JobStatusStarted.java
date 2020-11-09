package com.ververica.common.model.job;

import lombok.Data;

import java.util.Date;

@Data
public class JobStatusStarted {
  // Time of initial transition to {status.state: started}.
  Date startedAt;

  // Flink Job ID as a hex string.
  String flinkJobId;

  // Time of last observation update.
  Date lastUpdateTime;

  // The observed number of Flink job restarts, including process restarts. The number is a lower
  // bound on the actual number of Flink job restarts. On the happy path, it should be close to the
  // actual number. During failures, there are no guarantees except that it is lower than or equal
  // to the actual number of restarts.
  Integer observedFlinkJobRestarts;

  // The Flink JobStatus observed in the last probe. Either a Flink Job status string or UNKNOWN
  // if the Flink web API is not reachable.
  String observedFlinkJobStatus;
}
