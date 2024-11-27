package com.lhj.bbs.web.form.signup;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SignupForm {

  private String email;	// VARCHAR2(50 BYTE)

  private String passwd;	// VARCHAR2(50 BYTE)

  private String nickname; 	// VARCHAR2(30 BYTE)

}
