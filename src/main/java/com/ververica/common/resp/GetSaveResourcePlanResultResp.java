package com.ververica.common.resp;

import lombok.Data;

@Data
public class GetSaveResourcePlanResultResp {
  String message;
  Boolean success;
  String ticketStatus;
}
