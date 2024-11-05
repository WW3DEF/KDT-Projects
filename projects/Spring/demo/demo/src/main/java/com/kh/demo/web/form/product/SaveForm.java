package com.kh.demo.web.form.product;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter // Lombok 어노테이션으로, 필드에 대한 getter 메서드를 자동으로 생성
@Setter // Lombok 어노테이션으로, 필드에 대한 setter 메서드를 자동으로 생성
public class SaveForm {

  @NotBlank // 값이 비어있거나 공백일 수 없음을 검증
  @Size(min=1, max=10) // 문자열의 최소 길이와 최대 길이를 지정하여 검증
  private String pname; // 상품명 필드

  @NotNull // 값이 null일 수 없음을 검증
  @Positive // 양수(0보다 큰 숫자)인지 검증
  @Max(value=9999999999L) // 최대값을 지정하여 검증
  private Long quantity; // 수량 필드

  @NotNull // 값이 null일 수 없음을 검증
  @Positive // 양수(0보다 큰 숫자)인지 검증
  @Min(value=1000) // 최소값을 지정하여 검증
  @Max(value=9999999999L) // 최대값을 지정하여 검증
  private Long price; // 가격 필드
}

