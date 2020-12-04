package com.ververica.common.model.alarmrule;

import lombok.Data;

@Data
public class AlarmEvent {
   String message;
   long occurTime;
   String alarmRuleName;
}
