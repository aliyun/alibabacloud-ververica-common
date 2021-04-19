package com.ververica.common.params;

import lombok.Data;

@Data
public class CreateFolderParams {
  FolderMetadata metadata;

  @Data
  public static class FolderMetadata {
    String parentId;
    String namespace;
    String name;
  }
}
