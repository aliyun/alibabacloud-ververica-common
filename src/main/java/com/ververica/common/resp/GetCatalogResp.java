package com.ververica.common.resp;

import com.ververica.common.model.catalog.Catalog;
import lombok.Data;

@Data
public class GetCatalogResp {

  Catalog catalog;
}
