package com.ververica.common.resp;

import com.ververica.common.model.catalog.database.Database;
import java.util.List;
import lombok.Data;

@Data
public class ListDatabasesResp {
  List<Database> databases;
}
