package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.artifact.Artifact;
import lombok.Data;

@Data
public class GetArtifactMetadataResp {

  @JsonProperty("artifact")
  Artifact artifact;
}
