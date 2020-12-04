package com.ververica.common.params;


import com.ververica.common.model.alarmrule.AlarmContact;
import lombok.Data;

@Data
public class CreateAlarmContactParams {

    String contactName;
    String phone;
    String email;
    String dingRobot;
}
