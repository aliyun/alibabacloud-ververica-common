package com.ververica.common.resp;

import com.ververica.common.model.alarmrule.AlarmRule;
import lombok.Data;

import java.util.List;
@Data
public class ListAlarmRulesResp  {

    List<AlarmRule>data;
}
