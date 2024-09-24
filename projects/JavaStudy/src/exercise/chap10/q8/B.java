package exercise.chap10.q8;

public class B extends A{
  int m = 6;
  static int n = 8;
  public B() {
    super();
  }
  @Override
  void method1() {
    System.out.println("B 클래스 instance method");
  }
  static void method2() {
    System.out.println("B 클래스 static method");
  }

}
