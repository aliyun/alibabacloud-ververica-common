package com.ververica.common.model.alarmrule;

import lombok.Data;

@Data
public class AlarmContact {

  Long contactId;
  String contactName;
  String phone;
  String email;
  String userId;
  String dingRobot;
  Long createTime;
  Long updateTime;
  Boolean systemNoc;
  String webhook;
}
