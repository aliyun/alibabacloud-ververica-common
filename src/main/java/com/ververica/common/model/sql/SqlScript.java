package com.ververica.common.model.sql;

import lombok.Data;

import java.util.Date;

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
