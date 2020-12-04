package com.ververica.common.resp;

import com.ververica.common.model.sql.SqlScript;
import java.util.List;
import lombok.Data;

@Data
public class ListSqlScriptsResp {
  List<SqlScript> sqlScripts;
}
