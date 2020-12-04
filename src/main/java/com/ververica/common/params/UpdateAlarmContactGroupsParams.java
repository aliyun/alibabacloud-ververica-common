package com.ververica.common.params;

import lombok.Data;

@Data
public class UpdateAlarmContactGroupsParams extends CreateAlarmContactGroupsParams {
  Long contactGroupId;
}
