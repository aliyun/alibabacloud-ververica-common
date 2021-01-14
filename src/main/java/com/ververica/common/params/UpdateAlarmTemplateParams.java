package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateAlarmTemplateParams extends CreateAlarmTemplateParams{
  Integer id;
  Integer status;
}
