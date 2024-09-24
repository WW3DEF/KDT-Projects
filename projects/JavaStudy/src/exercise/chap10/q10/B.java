package exercise.chap10.q10;

public class B extends A{
  B() {
//    super(); 기본 생략
    System.out.println("B 생성자1");
  }

  B(int a) {
    this();
    System.out.println("A 생성자2");
  }
}
