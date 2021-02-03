package com.ververica.common.resp;

import com.ververica.common.model.workspace.Workspace;
import lombok.Data;

@Data
public class CreateWorkspaceResp {
  Workspace workspace;
}
