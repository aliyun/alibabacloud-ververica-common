package com.ververica.common.resp;

import com.ververica.common.model.catalog.function.Function;
import lombok.Data;

@Data
public class GetFunctionResp {
  Function function;
}
