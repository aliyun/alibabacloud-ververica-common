package com.ververica.common.params;


import com.ververica.common.model.alarmrule.AlarmContactGroups;
import lombok.Data;

@Data
public class UpdateAlarmContactGroupsParams  {
    int contactGroupId;
    String contactGroupName;
    String contactIds;


}
