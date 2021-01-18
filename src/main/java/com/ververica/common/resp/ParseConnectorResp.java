package com.ververica.common.resp;

import com.ververica.common.model.customconnector.Connector;
import java.util.List;
import lombok.Data;

@Data
public class ParseConnectorResp {
  List<Connector> connectors;
}
