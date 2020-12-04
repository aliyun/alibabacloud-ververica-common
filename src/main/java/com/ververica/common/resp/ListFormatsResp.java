package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.customconnector.Format;
import lombok.Data;

import java.util.List;
@Data
public class ListFormatsResp {
    @JsonProperty("formats")
    List<Format>formats;

}
