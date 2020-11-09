package com.ververica.common.model.namespace;

import lombok.Data;

@Data
public class RoleBinding {
  String role;
  String[] members;
}
