package com.ververica.common.params;

import java.util.List;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import lombok.Data;

@Data
public class CreateNamespaceParams {
  @NotNull String workspace;
  @NotNull String name;
  @NotEmpty List<String> owners;
}
