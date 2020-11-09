package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.catalog.function.Function;
import lombok.Data;

@Data
public class GetFunctionResp {

  @JsonProperty("function")
  Function function;
}
