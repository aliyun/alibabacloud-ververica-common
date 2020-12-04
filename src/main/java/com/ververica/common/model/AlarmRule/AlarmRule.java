package com.ververica.common.model.AlarmRule;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sun.org.apache.xpath.internal.operations.Bool;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.List;

/*{
        "name": "wlf_test",
        "description": "wldsz",
        "metric": "Restart Count in 1 Minute",
        "receivers": ["9126"],
        "rule": [{
        "comparator": "CURRENT_GTE",
        "thresholds": {
        "CRITICAL": 0
        },
        "check_interval": "1"
        }],
        "notify_rule": {
        "alarm_interval": "1",
        "time_range": "0:0-23:59",
        "critical": {
        "dingding": false,
        "mail": true,
        "sms": false
        }
        }
        }*/
@Data
public class AlarmRule {

    @NotNull String name;
    @NotNull String description;
    @NotNull String metric;
    List<String> receivers;
    List<Rule> rule;
    @JsonProperty("notify_rule")
    NotifyRule notifyRule;
    @Data
    public static  class NotifyRule{
        @JsonProperty("alarm_interval")
        String alarmInterval;
        @JsonProperty("time_range")
        String timeRange;

        Critical critical;
    }

    @Data
    public static  class Critical{
        Boolean dingding;
        Boolean mail;
        Boolean sms;

    }

}
