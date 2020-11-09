package com.ververica.common.model;

import lombok.Data;

@Data
public class PageMetadata {
  int pageSize;
  int pageIndex;
  int totalSize;
  int totalPage;
  int resultSize;
}
