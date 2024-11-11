package com.kh.demo.test;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Random;

@Slf4j
public class EnumTest {

  // 테스트 메서드 t1: 기본 enum 타입 출력 예제
  @Test
  void t1() {
    // Day enum 중에서 MONDAY 값을 today 변수에 저장
    Day today = Day.MONDAY;
    // 현재 날짜 출력
    log.info("Today is : " + today);

    // 모든 enum 값 출력
    for(Day day : Day.values()) {
      log.info("day={}", day);
    }
  }

  // 테스트 메서드 t2: 속성 있는 enum 타입 출력 예제
  @Test
  void t2(){
    // Day2의 각 enum 값과 해당 타입 출력
    for(Day2 day : Day2.values()) {
      log.info("{} is a {}", day, day.getType());
    }

    // Day2에서 SUNDAY를 찾고 출력
    Day2 sunday = Day2.valueOf("SUNDAY");
    log.info("sunday={}", sunday);
  }

  // 테스트 메서드 t3: enum을 사용하지 않고 상수 클래스로 주사위 값 관리
  @Test
  @DisplayName("enum타입을 사용안했을때")
  void t3(){
    Random random = new Random();
    int num = random.nextInt(6) + 1; // 1~6 사이의 랜덤 정수 생성

    // 랜덤 숫자에 따라 주사위 눈의 결과를 출력
    switch (num) {
      case Die.ONE:
        log.info("one");
        break;
      case Die.TWO:
        log.info("two");
        break;
      case Die.THREE:
        log.info("three");
        break;
      case Die.FOUR:
        log.info("four");
        break;
      case Die.FIVE:
        log.info("five");
        break;
      case Die.SIX:
        log.info("six");
        break;
      default:
        log.info("유효하지 않은 주사위눈!");
        break;
    }
  }

  // 테스트 메서드 t4: enum을 사용해 주사위 값 관리
  @Test
  @DisplayName("enum타입을 사용안했을때")
  void t4(){
    Random random = new Random();
    int num = random.nextInt(6) + 1; // 1~6 사이의 랜덤 정수 생성

    Die3 rolledDie = null;
    // Die3 enum을 순회하여 일치하는 주사위 값을 찾음
    for(Die3 die : Die3.values()) {
      if(die.getNum() == num){
        rolledDie = die;
        break;
      }
    }

    // 주사위 눈의 결과를 출력
    if(rolledDie != null) {
      log.info(rolledDie.getMeaning());
    } else {
      log.info("유효하지 않은 주사위눈!");
    }
  }

  @Test
  void t5(){
//    Die die = Die.ONE;
//    Die2 die2 = Die2.ONE;
    Die3 die3 = Die3.ONE;
  }

  // 요일을 정의하는 기본 enum 타입
  static enum Day{
    SUNDAY,
    MONDAY,
    TUESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY
  }

  // 속성이 있는 요일 enum 타입
  static enum Day2{
    // 각 요일은 "Weekday" 혹은 "Weekend" 속성을 가짐
    SUNDAY("Weekend"),
    MONDAY("Weekday"),
    TUESDAY("Weekday"),
    THURSDAY("Weekday"),
    FRIDAY("Weekday"),
    SATURDAY("Weekend");

    // 요일의 타입을 나타내는 속성
    private String type;

    // 생성자: enum 객체 생성 시 타입 속성 설정
    Day2(String type) {
      this.type = type;
    }

    // 타입을 반환하는 메서드
    public String getType(){
      return type;
    }
  }

  // 정수 상수로 주사위 값을 관리하는 클래스
  static class Die {
    public static final int ONE = 1;
    public static final int TWO = 2;
    public static final int THREE = 3;
    public static final int FOUR = 4;
    public static final int FIVE = 5;
    public static final int SIX = 6;
  }

  // 문자열 상수로 주사위 값을 관리하는 클래스
  static class Die2 {
    public static final String ONE = "one";
    public static final String TWO = "two";
    public static final String THREE = "three";
    public static final String FOUR = "four";
    public static final String FIVE = "five";
    public static final String SIX = "six";
  }

  // enum 타입으로 주사위 값을 관리하는 타입
  static enum Die3 {
    ONE(1,"one"),
    TWO(2,"two"),
    THREE(3,"three"),
    FOUR(4,"four"),
    FIVE(5,"five"),
    SIX(6,"six");

    // 주사위 값과 해당 뜻을 나타내는 속성
    private int num;
    private String meaning;

    // 생성자: 주사위 눈과 의미를 설정
    Die3(int num, String meaning) {
      this.num = num;
      this.meaning = meaning;
    }

    // 주사위 값을 반환하는 메서드
    public int getNum() {
      return num;
    }

    // 주사위 눈의 의미를 반환하는 메서드
    public String getMeaning() {
      return meaning;
    }
  }
}
