package com.ververica.common.model.AlarmRule;

import lombok.Data;

@Data
public class AlarmEvent {
   String message;
   long occurTime;
   String alarmRuleName;
}
