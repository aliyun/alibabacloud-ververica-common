package com.ververica.common.model.deployment;

import lombok.Data;

@Data
public class ResourcePlan {
  Boolean success;

  String plan;

  String message;
}
