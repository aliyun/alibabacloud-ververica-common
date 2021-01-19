package com.ververica.common.params;

import javax.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CreateAlarmContactParams {
  @NotBlank(message = "contactName not set")
  String contactName;

  @NotBlank(message = "phone not set")
  String phone;

  String email;
  String dingRobot;
}
