package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.customconnector.Table;
import lombok.Data;

import java.util.List;

@Data
public class ListTablesReferencingFormatResp {
    @JsonProperty("tables")
    List<Table>tables;
}
