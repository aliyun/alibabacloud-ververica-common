package com.ververica.common.model.alarmrule;

import lombok.Data;

@Data
public class Critical {
  Boolean dingding;
  Boolean mail;
  Boolean sms;
}
