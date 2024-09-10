package exercise.chap4;

public class Q4 {

  public static void main(String[] args) {
    method1();
    System.out.println("=========");
    method2();
    System.out.println("=========");
    method3();
    System.out.println("=========");

  }
  public static void method1() {
    for (int i = 10; i > 0; i-=2) {

      System.out.println(i);

    }
  }
  public static void method2() {
    int i = 10;
    while( i > 0) {
      System.out.println(i);
      i -= 2;
    }
  }
  public static void method3() {
    int i = 10;
    do {
      System.out.println(i);
      i -= 2;
    } while( i > 0);
  }
}
