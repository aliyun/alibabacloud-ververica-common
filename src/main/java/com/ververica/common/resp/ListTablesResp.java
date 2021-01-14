package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.catalog.table.Table;
import java.util.List;
import lombok.Data;

@Data
public class ListTablesResp {

  @JsonProperty("tables")
  List<Table> tables;
}
