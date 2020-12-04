package com.ververica.common.model.alarmrule;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class AlarmOptions {
//    	"metrics": ["Restart Count in 1 Minute", "Checkpoint Count in 5 Minutes", "Delay"],
//        "notifyWays": ["dingding", "mail", "sms"],
//        "ds-aggregators": ["AVG", "SUM", "MAX", "MIN"],
//        "comparators": ["CURRENT_GTE", "CURRENT_LTE"]
    List<String> metrics;
    List<String> notifyWays;
    @JsonProperty("ds-aggregators")
    List<String>  dsAggregators;
    List<String> comparators;



}
