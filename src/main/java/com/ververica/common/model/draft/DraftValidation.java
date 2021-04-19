package com.ververica.common.model.draft;

import java.util.List;
import lombok.Data;

@Data
public class DraftValidation {
  Integer errorCount;
  Boolean valid;
  List<Error> errors;
}
