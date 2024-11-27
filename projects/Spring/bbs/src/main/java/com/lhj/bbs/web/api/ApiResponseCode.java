package com.lhj.bbs.web.api;


import java.util.Arrays;

public enum ApiResponseCode {

//  응답 성공
    RESPONSE_SUCCESS("S00","Success"),

//  유효성 에러
    VALIDATION_ERROR("E01","Validation error"),
//  사용자 예외
    BUSINESS_ERROR("E02","Business error"),
//  엔티티 처리
    ENTITY_NOT_FOUND("E03","Entity not found"),

//  사용자 관련 예외
    USER_NOT_FOUND("U01", "User not found"),
    USER_ALREADY_EXISTS("U02", "User alreay exists"),
    INVALID_PASSWORD("U03", "Invalid password"),

//  시스템 예외
    INTERNAL_SERVER_ERROR("999", "Internal server error")
  ;

  private final String rtcd;
  private final String rtmsg;

  ApiResponseCode(String rtcd, String rtmsg) {
    this.rtcd = rtcd;
    this.rtmsg = rtmsg;
  }

  public String getRtcd() {
    return rtcd;
  }

  public String getRtmsg() {
    return rtmsg;
  }

  // 코드로 enum 조회
  public static ApiResponseCode of(String code) {
    return Arrays.stream(values())
        .filter(rc -> rc.getRtcd().equals(code))
        .findFirst()
        .orElse(INTERNAL_SERVER_ERROR);
  }

}
