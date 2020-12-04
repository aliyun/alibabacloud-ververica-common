package com.ververica.common.resp;

import com.ververica.common.model.member.Member;
import java.util.List;
import lombok.Data;

@Data
public class ListMembersResp {
  List<Member> members;
}
