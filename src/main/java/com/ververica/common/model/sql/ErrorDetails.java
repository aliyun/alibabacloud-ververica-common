package com.ververica.common.model.sql;

import lombok.Data;

@Data
public class ErrorDetails {
  int lineNumber;
  int columnNumber;
  int endLineNumber;
  int endColumnNumber;
  String message;
  String cause;
}
