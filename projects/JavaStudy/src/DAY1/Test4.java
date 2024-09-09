package day1;

public class Test4 {
  public static void main(String[] args) {
    int x;  // 정수형 변수 x 선언
    x = 10; // 초기화 : 변수선언후 최초값 할당
    x = 20; // 재할당 : 변수 초기화후 값 수정
    
    int y = 30;  // 정수형 변수 y 선언 + 초기화
    y = 40; // 재할당 : 변수 초기화후 값 수정
    
    int z = x + y; // 변수 x값 + 변수 y값 산술연산한 결과를 정수형변수 z에 초기화
    
    int i = 30 * 2; // 어떤 값의 2배수

    int j = method1(40) + 20;
    System.out.println(j);
  }
  
  public static int method1(int val) {
    int result = val * 2;
    return result;
  }
}
