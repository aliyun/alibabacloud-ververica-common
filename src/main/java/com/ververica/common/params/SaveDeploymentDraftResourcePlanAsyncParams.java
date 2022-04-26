package com.ververica.common.params;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SaveDeploymentDraftResourcePlanAsyncParams {
  @NotBlank(message = "content not set")
  String content;
}
