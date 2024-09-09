package day1;

public class Test5 {
  // case1) input : x , output : x
  public static void method1() {

  }

  // case2) input : 정수값 1개,  out: x
  public static void method2(int val) {

  }

  // case3) input : x , out: 정수값 1개
  public static int method3() {
    int x = 10;
    int y = 20;
    return x + y;
  }

  // case4) input : 정수값 1개, out: 정수값 1개
  public static int method4(int val) {
    return 0;
  }

  // case5) input : 정수값 1개, 실수1개 out: 실수값 1개
  public static double method5(int val, double val2) {

    return 3.14;
  }

  public static void main(String[] args) {
    int value = 10;
    int result = method6(value) * method6(value);
    System.out.println(result);
  }

  // 정수값 1개를 입력으로 받아 2배수 결과를 반환하는 메소드
  public static int method6(int x){
    return x * 2;
  }

}
