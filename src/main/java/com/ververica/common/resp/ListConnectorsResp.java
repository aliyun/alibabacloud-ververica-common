package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.customconnector.Connector;
import lombok.Data;

import java.util.List;
@Data
public class ListConnectorsResp {

  @JsonProperty("connectors")
  List<Connector>connectors;

}
