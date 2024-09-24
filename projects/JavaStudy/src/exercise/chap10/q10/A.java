package exercise.chap10.q10;

public class A {
  A() {
    super();
    System.out.println("A 생성자1");
  }

  A(int a) {
    this();
    System.out.println("A 생성자2");
  }
}
