package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.PageMetadata;
import com.ververica.common.model.deployment.Deployment;
import java.util.List;
import lombok.Data;

@Data
public class ListDeploymentsResp {

  @JsonProperty("metadata")
  PageMetadata pageMetadata;

  @JsonProperty("items")
  List<Deployment> deployments;
}
