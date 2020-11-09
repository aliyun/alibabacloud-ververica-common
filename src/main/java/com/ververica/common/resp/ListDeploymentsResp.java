package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.PageMetadata;
import com.ververica.common.model.deployment.Deployment;
import lombok.Data;

import java.util.List;

@Data
public class ListDeploymentsResp {

  @JsonProperty("metadata")
  PageMetadata pageMetadata;

  @JsonProperty("items")
  List<Deployment> deployments;
}
