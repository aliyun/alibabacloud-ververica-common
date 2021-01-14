package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.namespace.Namespace;
import java.util.List;
import lombok.Data;

@Data
public class ListNamespacesResp {

  @JsonProperty("namespaces")
  List<Namespace> namespaces;
}
