package com.ververica.common.model.sessioncluster;

import java.util.Map;
import lombok.Data;

@Data
public class SessionForceStopStateBase {
  SessionClusterMetadata metadata;
  SessionClusterSpec spec;

  @Data
  public static class SessionClusterMetadata {
    Map<String, String> annotations;
  }

  @Data
  public static class SessionClusterSpec {
    SessionClusterState state;
  }
}
