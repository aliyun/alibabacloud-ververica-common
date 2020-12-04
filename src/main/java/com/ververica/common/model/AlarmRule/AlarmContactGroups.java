package com.ververica.common.model.AlarmRule;

import lombok.Data;

import java.util.List;


@Data
public class AlarmContactGroups {

     int contactGroupId;
     String contactGroupName;
     String userId;
     String createTime;
     long updateTime;
     List<AlarmContact> contacts;
        

}
