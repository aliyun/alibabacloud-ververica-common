package com.ververica.common.resp;

import com.ververica.common.model.customconnector.Table;
import lombok.Data;
import java.util.List;

@Data
public class ListTablesReferencingFormatResp {
  List<Table> tables;
}
