package com.ververica.common.model.deploymenttarget;

import javax.validation.constraints.Positive;
import lombok.Data;
import lombok.NonNull;

@Data
public class YarnTarget {
  @NonNull String queue;
  @Positive Integer vcoreRatio = 8;
  String partition;
}
