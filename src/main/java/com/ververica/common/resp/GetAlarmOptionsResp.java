package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.alarmrule.AlarmOptions;
import com.ververica.common.model.catalog.database.Database;
import lombok.Data;

@Data
public class GetAlarmOptionsResp extends AlarmOptions {

}
