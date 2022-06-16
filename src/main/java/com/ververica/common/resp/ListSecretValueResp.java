package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.secretvalue.SecretValue;
import java.util.List;
import lombok.Data;

@Data
public class ListSecretValueResp {

  @JsonProperty("items")
  List<SecretValue> secretValues;
}
