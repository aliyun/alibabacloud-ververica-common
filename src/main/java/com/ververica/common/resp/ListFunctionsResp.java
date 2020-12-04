package com.ververica.common.resp;

import com.ververica.common.model.catalog.function.Function;
import java.util.List;
import lombok.Data;

@Data
public class ListFunctionsResp {

  List<Function> functions;
}
