package exercise.chap10.q8;

public class Main {
  public static void main(String[] args) {
    A ab = new B();

//    인스턴스 필드는 객체의 참조 타입에 따라 결정
    System.out.println(ab.m);
//    정적 필드는 클래스에 속하며, 클래스 이름을 통해 접근
    System.out.println(ab.n);

//    인스턴스 메소드는 객체의 실제 타입에 따라 결정
    ab.method1();
//    정적 메소드는 클래스에 속하며 클래스 이름을 통해 접근
    ab.method2();
  }
}