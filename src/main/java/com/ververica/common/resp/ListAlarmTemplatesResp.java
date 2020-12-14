package com.ververica.common.resp;

import com.ververica.common.model.alarmrule.AlarmTemplate;
import lombok.Data;

import java.util.List;
@Data
public class ListAlarmTemplatesResp  {

    List<AlarmTemplate>data;
}
