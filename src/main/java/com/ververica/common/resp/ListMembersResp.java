package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.member.Member;
import lombok.Data;

import java.util.List;
@Data
public class ListMembersResp {
  @JsonProperty("members")
  List<Member> members;
}
