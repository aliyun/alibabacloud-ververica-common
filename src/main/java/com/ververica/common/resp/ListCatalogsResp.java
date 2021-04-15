package com.ververica.common.resp;

import com.ververica.common.model.catalog.Catalog;
import java.util.List;
import lombok.Data;

@Data
public class ListCatalogsResp {

  List<Catalog> catalogs;
}
