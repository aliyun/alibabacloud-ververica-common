package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.savepoint.Savepoint;
import java.util.List;
import lombok.Data;

@Data
public class ListSavepointsResp {

  @JsonProperty("items")
  List<Savepoint> savepoints;
}
