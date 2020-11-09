package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.job.Job;
import lombok.Data;

import java.util.List;

@Data
public class ListJobsResp {

  @JsonProperty("items")
  List<Job> jobs;
}
