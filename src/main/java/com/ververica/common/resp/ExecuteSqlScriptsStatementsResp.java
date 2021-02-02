package com.ververica.common.resp;

import java.util.List;
import java.util.Map;
import lombok.Data;

@Data
public class ExecuteSqlScriptsStatementsResp {
  List<Map<String, String>> responses;
}
