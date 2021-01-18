package com.ververica.common.params;

import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateNamespaceParams {
  @NotNull String workspace;
  @NotNull String name;
  // Ali UID(1709064687573327,211874696439524479) or employee ID(034753)
  @NotEmpty List<String> owners;
}
