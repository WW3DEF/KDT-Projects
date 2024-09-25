package DAY13.exam1;
/*
  interface
  1. 객체생성 불가
  2. 생성자 없음
  3. 타입으로 사용가능
  4. 필드는 상수
  5. 메소드는 추상메소드
  6. default : 유지보수 용이성으로 추가
  7. static : 편의 메소드
  8. 다중구현, 다중상속 가능
 */
public interface Flyable {
  int X = 10; // static final 생략가능
  void fly(); /* abstract는 생략가능 */

  default void method1() {
    System.out.println("method1");
  }
  static void method2() {
    System.out.println("static method1");
  }
}