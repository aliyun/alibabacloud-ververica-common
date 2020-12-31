package com.ververica.common.model.namespace;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 *{
  "name": "namespaces/test",
  "roleBindings": [
    {
      "role": "owner",
      "members": [
        "user:1709064687573327"
      ]
    }
  ],
  "createTime": "2020-07-28T08:04:31.333915Z",
  "lifecyclePhase": "LIFECYCLE_PHASE_ACTIVE",
  "cluster": ""
}
 * name需要去掉namespace/前缀
 * members需要去掉user:前缀
 */
@Data
public class Namespace {

  String name;
  String workspace;
  Date createTime;
  List<RoleBinding> roleBindings;
  LifecyclePhase lifecyclePhase;
}
