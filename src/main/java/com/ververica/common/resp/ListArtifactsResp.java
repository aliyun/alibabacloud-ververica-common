package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.artifact.Artifact;
import lombok.Data;

import java.util.List;

@Data
public class ListArtifactsResp {

  @JsonProperty("artifacts")
  List<Artifact> artifacts;
}
