package DAY2;

import java.util.Scanner;

// 문) 구구단 2~9단까지 한번에 출력하는 프로그램을 구현하시오.
public class Gugudan4 {
  public static void main(String[] args) {
    for (int dansu = 2; dansu <= 9; dansu++) { /* 단수 */
      System.out.println("=============");
      for (int j = 1; j <= 9; j++) {
        System.out.println(dansu + " * " + j + " = " + dansu * j);
      }
    }
  }
}
