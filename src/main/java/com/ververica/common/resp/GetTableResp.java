package com.ververica.common.resp;

import com.ververica.common.model.catalog.table.Table;
import lombok.Data;

@Data
public class GetTableResp {
  Table table;
}
