package DAY11.exam4;

abstract public class Person {
//  추상 메소드(=미완성메소드) : 메소드 본문이 없는( 즉 선언부만 있는 )메소드
//                            추상메소드가 하나라도 존재하는 클래스는 추상클래스 이어야한다.
  abstract void eat();
  void smile() {
    System.out.println("웃다");
  }
}