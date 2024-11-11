package com.lhj.bbs.domain.entity;

import lombok.Data;

import java.sql.Timestamp;


// Object 클래스의 getter, setter, toString(), HashCode등의 메소드들을 자동으로 생성해주는 기능
@Data
public class Board {
  private Long boardId;   // 게시판아이디  board_Id	NUMBER(10,0) Primary key
  private String boardTitle;    // 제목 board_title	VARCHAR2(50 BYTE) NotNull
  private String boardContent;   // 내용 board_Content	 clob NotNull
  private String boardWriter;      // 글쓴이 PRICE	varchar2(30 byte) NotNull
  private Timestamp boardDate;    // 작성일 timestamp
  private Timestamp boardUpdate;   // 수정일 timestamp Default Null
}