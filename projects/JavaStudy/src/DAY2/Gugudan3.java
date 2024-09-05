package DAY2;

import java.util.Scanner;

// 문) 사용자로부터 단수를 입력받아 구구단 출력하는 프로그램을 구현하시오. ( for문 이용 )
// ( 단, 0이 입력되면 프로그램을 종료 )
public class Gugudan3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("구구단 출력 프로그램");

    boolean stop = false;
    while(!stop) {
      System.out.print("단수 입력 : ");
      int dansu = scanner.nextInt();
      if (dansu == 0) {
        System.out.println("구구단 종료");
        stop = true;
        continue; /* 반복문에서 continue를 만나면 조건식으로 이동 */
//        break; /* 반복문에서의 break문을 만나면 가장 가까운 반복문을 빠져나온다.*/
      }
      for (int i = 1; i <= 9; i++) {
        System.out.println(dansu + " * " + i + " = " + (dansu * i));
      }
    }
    System.out.println("프로그램 종료");
  }
}
// 줄 정리 crtl + alt + l