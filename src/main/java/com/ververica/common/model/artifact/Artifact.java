package com.ververica.common.model.artifact;

import lombok.Data;

import java.util.Date;

@Data
public class Artifact {
  String filename;
  String content;
  Date createTime;
  String uri;
}
