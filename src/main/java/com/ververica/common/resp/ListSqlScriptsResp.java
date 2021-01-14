package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.sql.SqlScript;
import java.util.List;
import lombok.Data;

@Data
public class ListSqlScriptsResp {

  @JsonProperty("sqlScripts")
  List<SqlScript> sqlScripts;
}
