package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateAlarmTemplateParams extends CreateAlarmTemplateParams {
  Long id;
  Integer status;
}
