package com.ververica.common.resp;

import com.ververica.common.model.catalog.Catalog;
import lombok.Data;

import java.util.List;

@Data
public class GetCatalogResp {

  Catalog catalog;
}
