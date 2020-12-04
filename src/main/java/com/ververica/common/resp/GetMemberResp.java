package com.ververica.common.resp;

import com.ververica.common.model.member.Member;
import lombok.Data;

@Data
public class GetMemberResp {
  Member member;
}
