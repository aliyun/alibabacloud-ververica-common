package com.ververica.common.resp;

import com.ververica.common.model.folder.Folder;
import java.util.Date;
import java.util.Map;
import javax.validation.Valid;
import lombok.Data;

@Data
public class GetRootFolderByTypeResp {
  FolderMetadata metadata;
  @Valid Folder.FolderSpec spec;

  @Data
  public static class FolderMetadata {
    String id;
    String namespace;
    Date createdAt;
    Date modifiedAt;
    String name;
    Map<String, String> annotations;
  }
}
