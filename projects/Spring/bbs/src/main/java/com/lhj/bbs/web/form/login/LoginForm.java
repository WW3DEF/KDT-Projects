package com.lhj.bbs.web.form.login;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LoginForm {

  private String email;	// VARCHAR2(50 BYTE)

  private String passwd;	// VARCHAR2(50 BYTE)

}