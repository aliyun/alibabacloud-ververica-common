package com.ververica.common.resp;

import com.ververica.common.model.sql.ErrorDetails;
import com.ververica.common.model.sql.ValidationResult;
import lombok.Data;

@Data
public class ValidateSqlScriptResp {
  ValidationResult validationResult;
  ErrorDetails errorDetails;
}
