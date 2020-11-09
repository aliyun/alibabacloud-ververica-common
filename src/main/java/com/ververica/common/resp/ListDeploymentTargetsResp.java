package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.deploymenttarget.DeploymentTarget;
import lombok.Data;

import java.util.List;

@Data
public class ListDeploymentTargetsResp {

  @JsonProperty("items")
  List<DeploymentTarget> deploymentTargets;
}
