package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.deploymenttarget.DeploymentTarget;
import java.util.List;
import lombok.Data;

@Data
public class ListDeploymentTargetsResp {

  @JsonProperty("items")
  List<DeploymentTarget> deploymentTargets;
}
