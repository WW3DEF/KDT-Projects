package Quiz;

import java.util.Random;
import java.util.Scanner;

/*
  문 ) 1 ~ 10까지의 임의의 정수값 맞추기
  제약조건 : 3번의 기회가 주어짐. 3번의 기호를 놓치면 꽝! 맞추면 빙고! 출력
*/
public class Q2_2 {
  public static void main(String[] args) {
    int chance = 3; // 맞출 기회수
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    boolean isYes = false;
    do {
      int numberToGuess = random.nextInt(10) + 1;
      System.out.println("1~10까지의 임의의 정수값 맞추기 (기회 3번)");

      boolean result = false; // computer win!

      for (int i = 1; i <= chance; i++) {
        System.out.print("정답 : ");
        int answer = sc.nextInt();

        if (answer > numberToGuess) {
          System.out.println("더 작은 숫자입니다.");
        } else if (answer < numberToGuess) {
          System.out.println("더 큰 숫자입니다.");
        } else {
          System.out.println("빙고!");
          result = true;
          break;
        }
      }
      if (result) {
        System.out.println("당신이 이겼습니다!! 짝짝짝!!!");
      } else {
        System.out.println("당신이 졌습니다!! 정답은 : " + numberToGuess);
      }
      sc.nextLine(); /* enter 1번 소비 */

      System.out.println("계속(y/n)");
      String yesOrNo = sc.nextLine();
      isYes = yesOrNo.equals("y") || yesOrNo.equals("Y");
    } while (isYes);
    System.out.println("프로그램 종료!!");
  }
}