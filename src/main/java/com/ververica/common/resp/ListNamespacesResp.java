package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.namespace.Namespace;
import lombok.Data;

import java.util.List;

@Data
public class ListNamespacesResp {

  @JsonProperty("namespaces")
  List<Namespace> namespaces;
}
