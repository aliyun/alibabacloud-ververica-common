package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.namespace.Namespace;
import lombok.Data;

@Data
public class GetNamespaceResp {

  @JsonProperty("namespace")
  Namespace namespace;

}
