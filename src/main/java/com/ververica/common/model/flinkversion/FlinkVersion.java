package com.ververica.common.model.flinkversion;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class FlinkVersion {
  Map<String, String> defaultImageTags;
  String flinkImageTagForSqlDeployments;
  List<String> flinkImageTags;
  String flinkMinorVersionForSqlDeployments;
  List<String> flinkMinorVersions;
  Map<String, String> versionForPatch;
}
