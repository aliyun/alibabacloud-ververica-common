package com.ververica.common.resp;

import com.ververica.common.model.catalog.database.Database;
import lombok.Data;
import java.util.List;

@Data
public class ListDatabasesResp {
  List<Database> databases;
}
