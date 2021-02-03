package com.ververica.common.resp;

import com.ververica.common.model.cluster.ClusterInfo;
import java.util.List;
import lombok.Data;

@Data
public class ListClusterInfosResp {
  List<ClusterInfo> clusterInfos;
}
