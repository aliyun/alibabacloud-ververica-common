package com.ververica.common.params;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SaveDeploymentDraftResourcePlanParams {
  @NotBlank(message = "content not set")
  String content;
}
