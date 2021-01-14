package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.job.Job;
import java.util.List;
import lombok.Data;

@Data
public class ListJobsResp {

  @JsonProperty("items")
  List<Job> jobs;
}
