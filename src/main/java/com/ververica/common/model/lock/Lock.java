package com.ververica.common.model.lock;

import java.util.Date;
import java.util.Map;
import lombok.Data;

@Data
public class Lock {
  LockMetadata metadata;
  LockSpec spec;

  @Data
  public static class LockMetadata {
    String id;
    String namespace;
    Date createdAt;
    Date modifiedAt;
    Map<String, String> labels;
    Map<String, String> annotations;
  }

  @Data
  public static class LockSpec {
    String holderId;
    String holderName;
  }
}
