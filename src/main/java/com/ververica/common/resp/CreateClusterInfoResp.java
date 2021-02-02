package com.ververica.common.resp;

import com.ververica.common.model.cluster.ClusterInfo;
import lombok.Data;

@Data
public class CreateClusterInfoResp {
  ClusterInfo clusterInfo;
}
