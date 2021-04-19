package com.ververica.common.model.draft;

import lombok.Data;

@Data
public class Error {
  String attribute;
  String message;
  String reason;
}
