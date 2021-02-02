package com.ververica.common.params;

import java.util.List;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreateAlarmContactGroupsParams {
  @NotEmpty(message = "contactIds not set")
  List<String> contactIds;

  @NotBlank(message = "contactGroupName not set")
  String contactGroupName;
}
