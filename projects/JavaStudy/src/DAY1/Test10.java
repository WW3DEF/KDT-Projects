package day1;

import java.util.Scanner;

// 문2) 사용자로부터 2개의 정수값을 입력 받아 큰값 출력는 프로그램을 구현하시오.
public class Test10 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(">>정수를 2개 입력받아 큰값 출력하기<<");
    System.out.print("정수1을 입력 : ");
    int value1 = scanner.nextInt();
    System.out.print("정수2을 입력 : ");
    int value2 = scanner.nextInt();

    //  + (문자열 연결연산자) : 피연산자중 하나라도 문자열이 있으면 문자열 연결 연산자
    System.out.println("value1의 값=" + value1);
    System.out.println("value2의 값=" + value2);

    if( value1 > value2 ) {
      System.out.println("큰 값=" + value1);
    }else if ( value1 < value2) {
      System.out.println("큰 값=" + value2);
    }else {
      System.out.println("큰 값=" + value1);
    }
  }
}
