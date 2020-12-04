package com.ververica.common.model.sql;

public enum ExecuteResult {
  RESULT_INVALID,
  /** <code>RESULT_SUCCESS = 1;</code> */
  RESULT_SUCCESS,
  /** <code>RESULT_SUCCESS_WITH_ROWS = 2;</code> */
  RESULT_SUCCESS_WITH_ROWS,
  /** <code>RESULT_ERROR_WITH_DETAILS = 3;</code> */
  RESULT_ERROR_WITH_DETAILS,
  /** <code>RESULT_SKIPPED = 4;</code> */
  RESULT_SKIPPED,
  UNRECOGNIZED
}
