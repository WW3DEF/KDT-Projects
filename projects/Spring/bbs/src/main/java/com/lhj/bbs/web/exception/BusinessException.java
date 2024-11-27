package com.lhj.bbs.web.exception;

import com.lhj.bbs.web.api.ApiResponseCode;
import lombok.Getter;

import java.util.Map;

@Getter
public class BusinessException extends RuntimeException {
  private final ApiResponseCode responseCode;
  private final Map<String, String> details;

  // 기본 생성자 - details 없음
  public BusinessException(ApiResponseCode responseCode) {
    super(responseCode.getRtmsg());
    this.responseCode = responseCode;
    this.details = null;
  }

  // details가 필요한 경우의 생성자
  public BusinessException(ApiResponseCode responseCode, Map<String, String> details) {
    super(responseCode.getRtmsg());
    this.responseCode = responseCode;
    this.details = details;
  }

}