package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.customconnector.Connector;
import lombok.Data;

@Data
public class UpdateConnectorResp {

  @JsonProperty("connector")
  Connector connector;

}
