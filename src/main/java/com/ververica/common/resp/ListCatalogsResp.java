package com.ververica.common.resp;

import com.ververica.common.model.catalog.Catalog;
import com.ververica.common.model.catalog.table.Table;
import lombok.Data;

import java.util.List;

@Data
public class ListCatalogsResp {

  List<Catalog> catalogs;
}
