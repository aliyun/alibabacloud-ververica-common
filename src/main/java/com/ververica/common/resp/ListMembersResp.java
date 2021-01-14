package com.ververica.common.resp;

import com.ververica.common.model.member.Member;
import lombok.Data;
import java.util.List;

@Data
public class ListMembersResp {
  List<Member> members;
}
