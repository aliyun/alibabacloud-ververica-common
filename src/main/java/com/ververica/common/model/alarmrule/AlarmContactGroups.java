package com.ververica.common.model.alarmrule;

import lombok.Data;

import java.util.List;


@Data
public class AlarmContactGroups {

  Integer contactGroupId;
  String contactGroupName;
  String userId;
  String contactIds;
  Long createTime;
  Long updateTime;
  List<AlarmContact> contacts;

}
