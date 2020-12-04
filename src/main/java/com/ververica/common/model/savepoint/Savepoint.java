package com.ververica.common.model.savepoint;

import com.ververica.common.model.Failure;
import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class Savepoint {
  SavepointMetadata metadata;
  SavepointSpec spec;
  SavepointStatus status;

  @Data
  public static class SavepointMetadata {
    String id;
    String namespace;
    Date createdAt;
    Date modifiedAt;
    String deploymentId;
    String jobId;
    SavepointOrigin origin;
    Map<String, String> annotations;
    Integer resourceVersion;
  }

  @Data
  public static class SavepointSpec {
    String savepointLocation;
    String flinkSavepointId;
  }

  @Data
  public static class SavepointStatus {
    SavepointState state;
    Failure failure;
  }
}
