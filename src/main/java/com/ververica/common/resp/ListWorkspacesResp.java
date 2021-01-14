package com.ververica.common.resp;

import com.ververica.common.model.workspace.Workspace;
import java.util.List;
import lombok.Data;

@Data
public class ListWorkspacesResp {

  List<Workspace> workspaces;
}
