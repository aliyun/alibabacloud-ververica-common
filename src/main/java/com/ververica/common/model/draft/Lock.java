package com.ververica.common.model.draft;

import java.util.Date;
import java.util.Map;
import javax.validation.constraints.NotBlank;
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
    @NotBlank(message = "holderId not set")
    String holderId;

    String holderName;
  }
}
