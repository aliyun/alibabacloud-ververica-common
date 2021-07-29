package com.ververica.common.model.flinkversion;

import java.util.List;
import java.util.Map;
import java.util.Set;
import lombok.Data;

@Data
public class FlinkVersion {
  Map<String, String> defaultImageTags;
  Map<String, String> defaultImageTagForFlinkVersion;
  String flinkImageTagForSqlDeployments;
  List<String> flinkImageTags;
  String flinkMinorVersionForSqlDeployments;
  List<String> flinkMinorVersions;
  Map<String, String> versionForPatch;
  Set<String> flinkVersionNames;
  String defaultFlinkVersionName;
  List<FlinkVersionMetadata> flinkVersionMetadatas;
}
