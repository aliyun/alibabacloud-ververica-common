package com.ververica.common.params;

import lombok.Data;

import java.util.List;

@Data
public class CreateAlarmContactGroupsParams{
    List<String> contactIds;
    String contactGroupName;
}
