package com.ververica.common.params;

import lombok.Data;
@Data
public class UpdateAlarmContactParams  {
  Integer contactId;
  String contactName;
  String phone;
  String email;
  String userId;
  String dingRobot;

}
