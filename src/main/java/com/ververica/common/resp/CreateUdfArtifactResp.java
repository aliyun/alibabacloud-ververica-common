package com.ververica.common.resp;

import com.ververica.common.model.udfartifact.UdfArtifact;
import lombok.Data;

@Data
public class CreateUdfArtifactResp {
  UdfArtifact udfArtifact;
}
