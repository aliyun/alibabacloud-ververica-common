package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.catalog.table.Table;
import lombok.Data;

@Data
public class GetTableResp {

  @JsonProperty("table")
  Table table;

}
