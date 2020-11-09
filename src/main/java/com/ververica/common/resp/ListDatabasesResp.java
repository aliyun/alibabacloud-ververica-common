package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.catalog.database.Database;
import lombok.Data;

import java.util.List;

@Data
public class ListDatabasesResp {

  @JsonProperty("databases")
  List<Database> databases;
}
