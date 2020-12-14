package com.ververica.common.resp;

import com.ververica.common.model.alarmrule.AlarmContactGroups;
import lombok.Data;

import java.util.List;
@Data
public class ListAlarmContactsGroupsResp {

    List<AlarmContactGroups>data;
}
