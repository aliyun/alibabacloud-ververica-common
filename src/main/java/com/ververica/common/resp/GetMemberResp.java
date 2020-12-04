package com.ververica.common.resp;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ververica.common.model.member.Member;
import lombok.Data;

@Data
public class GetMemberResp {
      @JsonProperty("member")
      Member member;
}
