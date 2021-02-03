package com.ververica.common.model.udfartifact;

import java.util.List;
import lombok.Data;

@Data
public class UdfArtifact {
  String name;
  String jarUrl;
  List<UdfClass> udfClasses;
  String createTime;
  String jarUpdateTime;
  String updateTime;
}
