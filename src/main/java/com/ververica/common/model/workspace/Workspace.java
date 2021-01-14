package com.ververica.common.model.workspace;

import lombok.Data;

@Data
public class Workspace {
  String name;
  String endpoint;
  String owner;
  String blobProperties;
  String grafana;
  String extras;
}
