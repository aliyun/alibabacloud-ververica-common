package com.ververica.common.params;

import lombok.Data;

@Data
public class CreateClusterInfoParams {
  String name;
  String clusterName;
  String storageUri;
  String zookeeperEndpoint;
  String region;
  String description;
}
