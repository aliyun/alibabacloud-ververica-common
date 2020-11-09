package com.ververica.common.model.sql;

import lombok.Data;

import java.util.List;

@Data
public class ResultTable {

  List<TableHeader> headers;
  List<TableRow> rows;

  @Data
  public static class TableHeader {
    String name;
  }

  @Data
  public static class TableRow {
    List<TableCell> cells;
  }

  @Data
  public static class TableCell {
    String value;
  }
}
