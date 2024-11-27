package com.lhj.bbs.web.form.board;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
public class DetailForm {

  private Long boardId; // 게시판아이디

  private Long userId; // 유저아이디

  private String boardTitle;   // 제목

  private String boardContent; // 내용

  private String boardWriter;  // 글쓴이

  private Timestamp boardDate; // 작성일

  private Timestamp boardUpdate; // 수정일

}
