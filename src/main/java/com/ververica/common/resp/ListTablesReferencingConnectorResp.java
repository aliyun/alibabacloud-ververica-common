package com.ververica.common.resp;

import com.ververica.common.model.customconnector.Table;
import java.util.List;
import lombok.Data;

@Data
public class ListTablesReferencingConnectorResp {
  List<Table> tables;
}
