package com.lhj.bbs.domain.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Reply {

  private Long replyId; // NUMBER(10,0)

  private Long boardId; // NUMBER(10,0)

  private Long userId; // NUMBER(10,0)

  private String replyWriter; // VARCHAR2(60 BYTE)

  private String replyContent; // CLOB

  private Timestamp createDate; // TIMESTAMP(6)

  private Timestamp updateDate; // TIMESTAMP(6)

}
