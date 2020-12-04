package com.ververica.common.model.AlarmRule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;


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
