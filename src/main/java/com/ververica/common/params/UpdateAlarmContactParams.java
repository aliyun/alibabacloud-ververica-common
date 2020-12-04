package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateAlarmContactParams extends CreateAlarmContactParams {
  Long contactId;
}
