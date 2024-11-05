package com.kh.demo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration // Spring의 설정 클래스
public class AppConfig implements WebMvcConfigurer { // WebMvcConfigurer 인터페이스를 구현하여 웹 관련 설정을 사용자 정의

// 상속받은 WebMvcConfigurer 클래스로부터 addCorsMappings를 오버라이딩
  @Override
  // CORS ( Cross-Origin Resource Sharing ) 설정은 웹 애플리케이션이 다른 도메인에서 리소스를 요청할때
//  발생하는 보안 정책을 관리하는 방법
//  Origin : 요청을 보내는 출처 ex) http://example.com
//  Allowed Origins : 요청을 허용할 출처 목록.
//  Allowed Methods : 허용할 HTTP 메소드 목록 ( ex : GET, POST, PUT, DELETE )
//  Max Age : 브라우저가 CORS 요청에 대한 사전 확인 요청 결과를 캐시할 시간(초) 설정
  public void addCorsMappings(CorsRegistry registry) { // CORS 설정을 추가하는 메소드
    registry.addMapping("/api/**") // "/api/**"로 시작하는 모든 요청 URL에 대해
        .allowedOrigins("http://localhost:5501" , "http://127.0.0.1:5500/", "http://127.0.0.1:3000/") // 해당 출처(Origin)를 허용
        .allowedMethods("*") // 모든 HTTP 메소드(GET, POST, PUT, DELETE 등)를 허용
        .maxAge(3000); // 브라우저에서 CORS 정보를 캐시하는 시간을 3000초로 설정
  }
}
