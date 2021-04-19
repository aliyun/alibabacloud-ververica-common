package com.ververica.common.model.folder;

import java.util.Date;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class Folder {
  FolderMetadata metadata;
  @Valid FolderSpec spec;

  @Data
  public static class FolderMetadata {
    String id;
    String parentId;
    String type;
    String namespace;
    Date createdAt;
    Date modifiedAt;
    Integer resourceVersion;
    String name;
    Map<String, String> labels;
    Map<String, String> annotations;
  }

  @Data
  public static class FolderSpec {
    @Valid List<FolderChild> children;
  }

  @Data
  public static class FolderChild {

    @NotBlank(message = "id not set")
    String id;

    @NotBlank(message = "type not set")
    String type;

    String name;
    Object resource;
  }
}
