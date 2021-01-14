package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateAlarmRuleParams extends CreateAlarmRuleParams {
  Integer id;
  Integer status;
}
