package com.ververica.common.model.cluster;

import lombok.Data;

@Data
public class ClusterInfo {
  String name;
  String clusterName;
  String storageUri;
  String zookeeperEndpoint;
  String region;
  String description;
  Integer deleted;
  String gmtCreate;
  String gmtModified;
}
