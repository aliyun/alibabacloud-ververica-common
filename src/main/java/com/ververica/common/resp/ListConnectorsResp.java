package com.ververica.common.resp;

import com.ververica.common.model.customconnector.Connector;
import lombok.Data;
import java.util.List;

@Data
public class ListConnectorsResp {

  List<Connector>connectors;

}
