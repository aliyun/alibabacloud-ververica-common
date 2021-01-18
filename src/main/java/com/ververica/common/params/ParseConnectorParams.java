package com.ververica.common.params;

import java.util.List;
import lombok.Data;

@Data
public class ParseConnectorParams {
  List<String> jarUris;
}
