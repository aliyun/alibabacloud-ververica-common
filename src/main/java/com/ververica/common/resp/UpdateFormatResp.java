package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.customconnector.Format;
import lombok.Data;

@Data
public class UpdateFormatResp  {
    @JsonProperty("format")
    Format format;

}
