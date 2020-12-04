package com.ververica.common.params;


import lombok.Data;

@Data
public class UpdateAlarmContactParams  {
    String contactId;
    String contactName;
    String phone;
    String email;
    String userId;
    String dingRobot;
    long createTime;
    long updateTime;
    boolean systemNoc;
    String webhook;

}
