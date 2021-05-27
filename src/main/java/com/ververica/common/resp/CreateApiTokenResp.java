package com.ververica.common.resp;

import com.ververica.common.model.ubsInfo.UbsInfo;
import lombok.Data;

@Data
public class CreateApiTokenResp {
  UbsInfo ubsInfo;
}
