package com.ververica.common.params;

import java.util.List;
import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateAlarmContactGroupsParams {
  List<String> contactIds;

  @NotBlank(message = "contactGroupName not set")
  String contactGroupName;
}
