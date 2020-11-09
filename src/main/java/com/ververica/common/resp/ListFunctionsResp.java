package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.catalog.function.Function;
import lombok.Data;

import java.util.List;

@Data
public class ListFunctionsResp {

  @JsonProperty("functions")
  List<Function> functions;
}
