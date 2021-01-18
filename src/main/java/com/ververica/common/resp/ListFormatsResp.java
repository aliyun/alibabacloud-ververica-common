package com.ververica.common.resp;

import com.ververica.common.model.customconnector.Format;
import java.util.List;
import lombok.Data;

@Data
public class ListFormatsResp {

  List<Format> formats;
}
