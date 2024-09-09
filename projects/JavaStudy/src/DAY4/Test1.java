package DAY4;

//    main메소드는 JVM((Java Virtual Machine)자바 가상 머신)이 호출함
public class Test1 {

  public static void main(String[] args) {
    method1(); /* 메소드호출 */
    method2(10, 20);
    int result = method3();
    System.out.println("result = " + result);
    System.out.println(method4(300, 400));
    System.out.println(method4(3, 4));
    System.out.println(method4(30, 40));

    int x = 10;
    int y = 20;
    int result2 = method4(100, 200) + method3() + 10 + x + y;
    int result3 = method4(x, y);
    int result4 = method4(x + y, method3());
    System.out.println("result4 = " + result4);

  }

  public static void method1() {
    System.out.println("method1 호출됨!");
  }

  public static void method2(int x, int y) {
    int result = 0;
    result = x + y;
    System.out.println("result = " + result);
  }

  public static int method3() {

    return 0;
  }

  public static int method4(int x, int y) {

    return (x % 2 == 0) ? 0 : 1;
  }

}