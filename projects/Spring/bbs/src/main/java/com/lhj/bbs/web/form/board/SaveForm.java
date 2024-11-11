package com.lhj.bbs.web.form.board;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter // Lombok 어노테이션으로, 필드에 대한 getter 메서드를 자동으로 생성
@Setter // Lombok 어노테이션으로, 필드에 대한 setter 메서드를 자동으로 생성
public class SaveForm {

  private String boardTitle;   // 제목

  private String boardContent; // 내용

  private String boardWriter; // 글쓴이

}

