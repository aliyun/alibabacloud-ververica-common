package com.ververica.common.resp;

import com.ververica.common.model.customconnector.Format;
import lombok.Data;
import java.util.List;

@Data
public class ListFormatsResp {

  List<Format> formats;

}
