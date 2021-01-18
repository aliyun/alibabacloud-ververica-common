package com.ververica.common.model.alarmrule;

import java.util.List;
import lombok.Data;

@Data
public class AlarmContactGroups {

  Long contactGroupId;
  String contactGroupName;
  String userId;
  String contactIds;
  Long createTime;
  Long updateTime;
  List<AlarmContact> contacts;
}
