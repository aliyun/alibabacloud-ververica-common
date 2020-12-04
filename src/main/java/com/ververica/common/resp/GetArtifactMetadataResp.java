package com.ververica.common.resp;

import com.ververica.common.model.artifact.Artifact;
import lombok.Data;

@Data
public class GetArtifactMetadataResp {
  Artifact artifact;
}
