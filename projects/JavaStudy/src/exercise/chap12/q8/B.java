package exercise.chap12.q8;

public class B implements A{
  @Override
  public void abc() {
    A.super.abc(); // 인터페이스의 경우 다중 상속이 가능하기에 여러 인터페이스에 동일한 기본 메소드가 있을때
//    어떤 메소드를 호출할 지 명확하게 하기 위해서 ( 다중 상속 문제 )
//    클래스는 단일 상속이기에 이런 경우가 발생하지 않기에 super 키워드만으로 부모 클래스의 메소드 호출이 가능함
//    System.out.println("A인터페이스의 abc()");
    System.out.println("B 클래스의 abc()");
  }
}