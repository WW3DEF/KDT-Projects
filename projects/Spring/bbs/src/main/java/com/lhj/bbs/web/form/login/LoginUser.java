package com.lhj.bbs.web.form.login;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class LoginUser {

  private Long userId;	// NUMBER(10,0)

  private String email;	// VARCHAR2(50 BYTE)

  private String passwd;	// VARCHAR2(50 BYTE)

  private String nickname; 	// VARCHAR2(30 BYTE)

}
