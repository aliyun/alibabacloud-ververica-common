package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.artifact.Artifact;
import java.util.List;
import lombok.Data;

@Data
public class ListArtifactsResp {

  @JsonProperty("artifacts")
  List<Artifact> artifacts;
}
