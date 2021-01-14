package com.ververica.common.params;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
public class CreateNamespaceParams {
  @NotNull
  String workspace;
  @NotNull
  String name;
  @NotEmpty
  List<String> owners;
}
