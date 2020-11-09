package com.ververica.common.model.sql;

import lombok.Data;

@Data
public class DdlTemplate {

  String name;
  String displayName;
  TemplateType type;
  String template;

}
