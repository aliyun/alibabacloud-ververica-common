package com.ververica.common.resp;

import com.ververica.common.model.workspace.Workspace;
import lombok.Data;

import java.util.List;

@Data
public class ListWorkspacesResp {

  List<Workspace> workspaces;
}
