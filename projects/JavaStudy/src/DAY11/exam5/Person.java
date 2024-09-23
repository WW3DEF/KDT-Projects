package DAY11.exam5;

public class Person extends Object{
//  필드
//  인스턴스 필드 : 객체별로 갖고잇는 속성
  int age;
//  정적 필드(클래스 필드) : 클래스 수준에서 갖고있는 속성
  static int cnt;

//  생성자
  Person() {super();}

//  메소드
//  인스턴스 메소드 : 객체를 생성해야 사용할 수 있는 메소드
  void addAge() {
    age++;
  }

  //  정적(클래스) 메소드 : 객체를 생성하지 않고도 사용할 수 있는 메소드
  static void addCnt() {
    cnt++;
  }

  //  메소드 오버라이딩(method overriding) : 재정의
//  @Override // 재정의 대상 메소드 선언부와 동일한지 체크하는 어노테이션

  @Override
  public String toString() {
    return "나이 : " + age;
  }
}