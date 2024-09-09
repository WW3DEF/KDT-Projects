package day1;

import java.util.Scanner;

// 문) 사용자로부터 3개의 정수값을 입력받아 제일 큰 값 출력하는 프로그램을 작성하시오
public class Test11 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println(">>정수를 3개 입력받아 큰값 출력하기<<");
    System.out.print("정수1을 입력 : ");
    int value1 = scanner.nextInt();
    System.out.print("정수2을 입력 : ");
    int value2 = scanner.nextInt();
    System.out.print("정수3을 입력 : ");
    int value3 = scanner.nextInt();

    System.out.println("value1의 값=" + value1);
    System.out.println("value2의 값=" + value2);
    System.out.println("value3의 값=" + value3);

    int max = value1;
    if( value2 > max) {
      max = value2;
    }
    if( value3 > max) {
      max = value3;
    }
    System.out.println("최대값 = " + max);
  }
}
