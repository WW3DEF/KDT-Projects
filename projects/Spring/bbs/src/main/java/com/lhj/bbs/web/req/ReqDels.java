package com.lhj.bbs.web.req;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString
public class ReqDels {

  private List<Long> replyIds;

}
