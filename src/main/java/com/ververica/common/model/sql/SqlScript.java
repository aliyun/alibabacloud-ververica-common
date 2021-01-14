package com.ververica.common.model.sql;

import java.util.Date;
import lombok.Data;

@Data
public class SqlScript {

  String name;
  String displayName;
  String script;
  String description;
  Date createTime;
  Date updateTime;
  String creator;
  String modifier;
}
