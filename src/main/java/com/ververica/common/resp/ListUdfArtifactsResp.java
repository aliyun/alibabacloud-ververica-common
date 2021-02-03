package com.ververica.common.resp;

import com.ververica.common.model.udfartifact.UdfArtifact;
import java.util.List;
import lombok.Data;

@Data
public class ListUdfArtifactsResp {
  List<UdfArtifact> udfArtifacts;
}
