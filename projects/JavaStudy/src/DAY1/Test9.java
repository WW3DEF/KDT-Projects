package day1;
//문제1) 정수를 입력받아 홀수,짝수를 출력하는 프로그램을 구현하시오.
import java.util.Scanner;

public class Test9 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("정수를 입력하세요 : ");
    int number = scanner.nextInt();

    if (number % 2 == 0) {
      System.out.println("짝수");
    } else {
      System.out.println("홀수");
    }
  }
}
