package com.ververica.common.resp;

import com.ververica.common.model.catalog.database.Database;
import lombok.Data;

@Data
public class GetDatabaseResp {
  Database database;
}
