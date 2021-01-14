package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.catalog.function.Function;
import java.util.List;
import lombok.Data;

@Data
public class ListFunctionsResp {

  @JsonProperty("functions")
  List<Function> functions;
}
