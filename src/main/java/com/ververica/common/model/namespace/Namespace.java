package com.ververica.common.model.namespace;

import java.util.Date;
import java.util.List;
import lombok.Data;

@Data
public class Namespace {

  String name;
  String workspace;
  Date createTime;
  List<RoleBinding> roleBindings;
  LifecyclePhase lifecyclePhase;
  String previewSessionClusterName;
}
