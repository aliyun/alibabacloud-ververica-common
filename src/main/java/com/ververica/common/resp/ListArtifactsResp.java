package com.ververica.common.resp;

import com.ververica.common.model.artifact.Artifact;
import lombok.Data;
import java.util.List;

@Data
public class ListArtifactsResp {

  List<Artifact> artifacts;
}
