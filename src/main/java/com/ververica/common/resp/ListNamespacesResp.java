package com.ververica.common.resp;

import com.ververica.common.model.namespace.Namespace;
import java.util.List;
import lombok.Data;

@Data
public class ListNamespacesResp {
  List<Namespace> namespaces;
}
