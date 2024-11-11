package com.lhj.bbs.web.form.board;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class AllForm {
  private Long boardId; // 게시판아이디
  private String boardTitle;   // 제목
  private String boardWriter;  // 글쓴이
  private Timestamp boardDate; // 작성일
}
