package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateWorkspaceParams {
  String endpoint;
  String owner;
  String blobProperties;
  String grafana;
  String extras;
  String regionId;
  String askClusterId;
  String kubeConfig;
}
