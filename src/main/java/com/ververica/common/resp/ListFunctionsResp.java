package com.ververica.common.resp;

import com.ververica.common.model.catalog.function.Function;
import lombok.Data;
import java.util.List;

@Data
public class ListFunctionsResp {

  List<Function> functions;
}
