package com.kh.demo.web.api;

import java.util.Arrays;

public enum ApiResponseCode {
//  성공 응답
  SUCCESS("S00", "Success"),

  // 공통 예외
  VALIDATION_ERROR("E01", "Validation error occurred"),
  BUSINESS_ERROR("E02", "Business error occurred"),
  ENTITY_NOT_FOUND("E03", "Entity not found"),

  // 사용자 관련 예외
  USER_NOT_FOUND("U01", "User not found"),
  USER_ALREADY_EXISTS("U02", "User already exists"),
  INVALID_PASSWORD("U03", "Invalid password"),

//  시스템 예외
  INTERNAL_SERVER_ERROR("999", "Internal server error");

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

//  코드로 enum 조회
// code에 해당하는 ApiResponseCode를 찾아 반환합니다. 없으면 INTERNAL_SERVER_ERROR를 반환합니다.
public static ApiResponseCode of(String code) {
  return Arrays.stream(values())  // 모든 enum 값을 Stream으로 변환
      .filter(rc -> rc.getRtcd().equals(code))  // 주어진 code와 일치하는 rtcd 값을 가진 enum을 필터링
      .findFirst()  // 첫 번째 일치하는 값을 찾음
      .orElse(INTERNAL_SERVER_ERROR);  // 일치하는 값이 없으면 INTERNAL_SERVER_ERROR 반환
}


//  응답 생성 헬퍼 메소드
// ApiResponseCode(enum) 값을 기반으로 응답 객체(ApiResponse)를 생성하여 반환합니다.
public <T> ApiResponse<T> toResponse(T data) {
  return ApiResponse.createApiResponse(this, data );  // 현재 enum 값을 응답 코드로 설정하고 data를 포함한 응답 생성
  }
}
