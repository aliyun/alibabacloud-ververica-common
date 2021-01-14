package com.ververica.common.model.artifact;

import java.util.Date;
import lombok.Data;

@Data
public class Artifact {

  String filename;
  String content;
  Date createTime;
  String uri;
}
