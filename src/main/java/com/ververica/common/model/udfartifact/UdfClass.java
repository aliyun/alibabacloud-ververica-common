package com.ververica.common.model.udfartifact;

import java.util.List;
import lombok.Data;

@Data
public class UdfClass {
  String className;
  String classType;
  String udfArtifactName;
  List<String> functionNames;
}
