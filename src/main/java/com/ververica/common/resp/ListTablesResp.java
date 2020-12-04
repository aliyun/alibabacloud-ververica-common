package com.ververica.common.resp;

import com.ververica.common.model.catalog.table.Table;
import java.util.List;
import lombok.Data;

@Data
public class ListTablesResp {

  List<Table> tables;
}
