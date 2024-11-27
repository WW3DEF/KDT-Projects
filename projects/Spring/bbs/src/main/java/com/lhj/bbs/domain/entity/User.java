package com.lhj.bbs.domain.entity;

import lombok.Data;

@Data
public class User {

  private Long userId;	// NUMBER(10,0)

  private String email;	// VARCHAR2(50 BYTE)

  private String passwd;	// VARCHAR2(50 BYTE)

  private String nickname; 	// VARCHAR2(30 BYTE)

}