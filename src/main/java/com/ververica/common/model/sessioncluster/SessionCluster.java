package com.ververica.common.model.sessioncluster;

import lombok.Data;

@Data
public class SessionCluster extends SessionClusterBase {
  SessionClusterStatus status;

  @Data
  public static class SessionClusterStatus {
    SessionClusterStatusState state;
  }
}
