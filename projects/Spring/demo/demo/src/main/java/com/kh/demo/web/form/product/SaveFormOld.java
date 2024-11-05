package com.kh.demo.web.form.product;

import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Getter // Lombok 어노테이션으로, 필드에 대한 getter 메서드를 자동으로 생성
@Setter // Lombok 어노테이션으로, 필드에 대한 setter 메서드를 자동으로 생성
public class SaveFormOld {

  @NotBlank(message="상품명은 필수 입니다.") // 값이 비어있거나 공백일 수 없음을 검증
  @Size(min=1, max=10, message="상품명은 10자를 초과할수 없습니다.") // 문자열의 최소 길이와 최대 길이를 지정하여 검증
  private String pname; // 상품명 필드

  @NotNull(message="수량은 필수 입니다.") // 값이 null일 수 없음을 검증
  @Positive(message = "수량은 양수여야 합니다.") // 양수(0보다 큰 숫자)인지 검증
  @Max(value=9999999999L, message="수량은 10자리 이하여야 합니다") // 최대값을 지정하여 검증
  private Long quantity; // 수량 필드

  @NotNull(message="가격은 필수 입니다.") // 값이 null일 수 없음을 검증
  @Positive(message = "가격은 양수여야 합니다.") // 양수(0보다 큰 숫자)인지 검증
  @Min(value=1000, message="가격은 1000미만 불가합니다") // 최소값을 지정하여 검증
  @Max(value=9999999999L, message="가격은 10자리 이하여야 합니다") // 최대값을 지정하여 검증
  private Long price; // 가격 필드
}

