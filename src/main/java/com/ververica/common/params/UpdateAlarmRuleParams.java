package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateAlarmRuleParams extends CreateAlarmRuleParams {
  Long id;
  Integer status;
}
