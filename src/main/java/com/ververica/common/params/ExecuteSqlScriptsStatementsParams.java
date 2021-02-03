package com.ververica.common.params;

import java.util.List;
import lombok.Data;

@Data
public class ExecuteSqlScriptsStatementsParams {
  List<String> executeFunctionStr;
}
