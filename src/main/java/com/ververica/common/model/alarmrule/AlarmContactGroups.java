package com.ververica.common.model.alarmrule;

import lombok.Data;

import java.util.List;


@Data
public class AlarmContactGroups {
//     {
//          "contactGroupId" : 0,
//             "contactGroupName" : "sdktest1",
//             "contactIds" : "12405",
//             "createTime" : 0,
//             "updateTime" : 0
//     }
     int contactGroupId;
     String contactGroupName;
     String userId;
     String contactIds;
     long createTime;
     long updateTime;
     List<AlarmContact> contacts;
        

}
