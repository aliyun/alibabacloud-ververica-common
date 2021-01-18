package com.ververica.common.resp;

import com.ververica.common.model.artifact.Artifact;
import java.util.List;
import lombok.Data;

@Data
public class ListArtifactsResp {

  List<Artifact> artifacts;
}
