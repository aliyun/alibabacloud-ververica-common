package com.ververica.common.model.deploymenttarget;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.Positive;

@Data
public class YarnTarget {
  @NonNull String queue;
  @Positive Integer vcoreRatio = 8;
  String partition;
}
