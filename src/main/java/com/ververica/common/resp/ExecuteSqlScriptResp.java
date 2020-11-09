package com.ververica.common.resp;

import com.ververica.common.model.sql.ErrorDetails;
import com.ververica.common.model.sql.ExecuteResult;
import com.ververica.common.model.sql.ResultTable;
import lombok.Data;

@Data
public class ExecuteSqlScriptResp {

  ExecuteResult result;
  ErrorDetails errorMessage;
  ResultTable resultTable;

}
