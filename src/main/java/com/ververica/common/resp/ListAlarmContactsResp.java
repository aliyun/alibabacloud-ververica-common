package com.ververica.common.resp;

import com.ververica.common.model.alarmrule.AlarmContact;
import lombok.Data;

import java.util.List;
@Data
public class ListAlarmContactsResp  {

    List<AlarmContact>data;
}
