package com.ververica.common.params;

import lombok.Data;

@Data
public class CreateAlarmContactParams {
  String contactName;
  String phone;
  String email;
  String dingRobot;
}
