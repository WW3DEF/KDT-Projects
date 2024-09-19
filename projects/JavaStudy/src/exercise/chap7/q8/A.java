package exercise.chap7.q8;

public class A {
  int a,b,c,d;
  A() {
    this(5); // 동일 클래스내의 다른 생성자메소드 호출
  }

  A(int k) {
    a = k;
    b = k;
    c = k;
    d = k;
  }
}
