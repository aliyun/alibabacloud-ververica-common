package com.ververica.common.model.namespace;

import lombok.Data;

import java.util.Date;
import java.util.List;


@Data
public class Namespace {

  String name;
  String workspace;
  Date createTime;
  List<RoleBinding> roleBindings;
  LifecyclePhase lifecyclePhase;
  String previewSessionClusterName;

}
