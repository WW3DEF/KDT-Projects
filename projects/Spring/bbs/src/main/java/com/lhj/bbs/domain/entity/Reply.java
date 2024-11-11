package com.lhj.bbs.domain.entity;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class Reply {
  private Long replyId;
  private Long boardId;
  private String replyWriter;
  private String replyContent;
  private Timestamp createDate;
  private Timestamp updateDate;
}
