package day1;

// class
public class Test2 {

  // main 메소드 : 실행메소드
  public static void main(String[] args){
    System.out.println("main 메소드");
    method1(); // method1 호출
    int val = 10;
    if(val % 2 == 1) {
      method2(); // method2 호출
    }else {
      method3(); // method3 호출
    }

    for(int i=1; i<=3; i++){
      method3();
    }
  }

  // method1 메소드 정의
  public static void method1(){
    System.out.println("method1 메소드");
    method2();
  }

  // method2 메소드 정의
  public static void method2(){
    System.out.println("method2 메소드");
  }

  // method3 메소드 정의
  public static void method3(){
    System.out.println("method3 메소드");
  }
}
