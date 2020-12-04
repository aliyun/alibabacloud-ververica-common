package com.ververica.common.resp;

import com.ververica.common.model.customconnector.Connector;
import lombok.Data;

@Data
public class CreateConnectorResp {
  Connector connector;
}
