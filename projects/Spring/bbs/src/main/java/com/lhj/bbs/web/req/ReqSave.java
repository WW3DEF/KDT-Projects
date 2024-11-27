package com.lhj.bbs.web.req;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.sql.Timestamp;

@Getter
@Setter
@ToString
public class ReqSave {

  private Long replyId; // NUMBER(10,0)

  private Long boardId; // NUMBER(10,0)

  private Long userId; // NUMBER(10,0)

  private String replyWriter; // VARCHAR2(60 BYTE)

  private String replyContent; // CLOB

  private Timestamp createDate; // TIMESTAMP(6)

  private Timestamp updateDate; // TIMESTAMP(6)

}
