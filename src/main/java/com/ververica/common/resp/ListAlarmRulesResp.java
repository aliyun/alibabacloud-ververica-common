package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.AlarmRule.AlarmRule;

import java.util.List;
public class ListAlarmRulesResp  {

    List<AlarmRule>data;
}
