package com.ververica.common.params;

import lombok.Data;

@Data
public class CreateUdfArtifactParams {
  String name;
  String jarUrl;
}
