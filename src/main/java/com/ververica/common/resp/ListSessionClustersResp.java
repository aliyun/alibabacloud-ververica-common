package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.PageMetadata;
import com.ververica.common.model.sessioncluster.SessionCluster;
import java.util.List;
import lombok.Data;

@Data
public class ListSessionClustersResp {

  @JsonProperty("metadata")
  PageMetadata pageMetadata;

  @JsonProperty("items")
  List<SessionCluster> sessionClusters;
}
