package DAY2;

import java.util.Scanner;

// 문) 사용자로부터 단수를 입력받아 구구단 출력하는 프로그램을 구현하시오. ( for문 이용 )
// ( 단, 0이 입력되면 프로그램을 종료 )
public class Gugudan2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("구구단 출력 프로그램");

    System.out.print("단수 입력 : ");
    int dansu = scanner.nextInt();

    for (int i = 1; i <= 9; i++) {
      System.out.println(dansu + " * " + i + " = " + (dansu * i));
    }
  }
}
// 줄 정리 crtl + alt + l