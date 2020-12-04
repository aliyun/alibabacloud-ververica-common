package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.ui.GetDynamicIndicators;
import lombok.Data;

@Data
public class GetDynamicIndicatorsResp {

  @JsonProperty("linkTemplates")
  GetDynamicIndicators getDynamicIndicators;

}
