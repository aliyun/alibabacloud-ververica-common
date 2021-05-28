package com.ververica.common.model.ubsInfo;

import lombok.Data;

@Data
public class UbsInfo {

  String namespace;
  String endpoint;
  String bucket;
  String owner;
  String type;
  String extras;
}
