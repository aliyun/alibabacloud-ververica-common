package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.savepoint.Savepoint;
import lombok.Data;

import java.util.List;

@Data
public class ListSavepointsResp {

  @JsonProperty("items")
  List<Savepoint> savepoints;
}
