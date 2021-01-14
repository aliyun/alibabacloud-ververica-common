package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.catalog.database.Database;
import java.util.List;
import lombok.Data;

@Data
public class ListDatabasesResp {

  @JsonProperty("databases")
  List<Database> databases;
}
