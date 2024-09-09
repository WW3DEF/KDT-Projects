package Quiz;

import java.util.Random;
import java.util.Scanner;

// 문 ) 가위, 바위, 보 게임 구현하기
public class Q3 {
  public static void main(String[] args) {
    Random rd = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.println("가위, 바위, 보 게임");
    boolean isYes = false;
    do {
      int rsp = rd.nextInt(3)+1;
      System.out.println("--------------------");
      System.out.println("1. 가위 2. 바위 3. 보");
      System.out.println("--------------------");

      int aw = sc.nextInt();

      System.out.println("상대방의 수 : " + rsp);
      System.out.println("나의 수 : " + aw);

      if ((aw == 1 && rsp == 2) || (aw == 2 && rsp == 3) || (aw == 3 && rsp == 1))  {
        System.out.println("당신이 졌습니다");

      } else if ((aw == 1 && rsp == 3) || (aw == 2 && rsp == 1) || aw == 3 && rsp == 2) {
        System.out.println("당신이 이겼습니다");

      } else {
        System.out.println("비겼습니다. 다시 진행해주십시오");
        continue;
      }
      sc.nextLine();

      System.out.println("다시 진행하시겠습니까? ( y / n )");
      String yesOrNo = sc.nextLine();
      isYes = yesOrNo.equals("y") || yesOrNo.equals("Y");
    }while (isYes);
  }
}