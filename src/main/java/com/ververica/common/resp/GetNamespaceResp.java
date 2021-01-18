package com.ververica.common.resp;

import com.ververica.common.model.namespace.Namespace;
import lombok.Data;

@Data
public class GetNamespaceResp {
  Namespace namespace;
}
