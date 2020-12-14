package com.ververica.common.model.alarmrule;

import lombok.Data;


@Data
public class AlarmContact {

         int contactId;
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
