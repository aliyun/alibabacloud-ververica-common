package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.sql.SqlScript;
import lombok.Data;

import java.util.List;

@Data
public class ListSqlScriptsResp {

  @JsonProperty("sqlScripts")
  List<SqlScript> sqlScripts;
}
