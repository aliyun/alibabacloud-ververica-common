package com.ververica.common.model.flinkversion;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class FlinkVersionMetadata {
  String versionName;
  String flinkVersion;
  String vvrVersion;
  String imageTag;
  String tarUrl;
  Status status;
  Map<String, String> labels = Collections.emptyMap();
  List<String> defaultFor = Collections.emptyList();
  Boolean useForSqlDeployments = false;
}
