package Quiz;

import java.util.Random;
import java.util.Scanner;

/*
  문 ) 1 ~ 10까지의 임의의 정수값 맞추기
  제약조건 : 3번의 기회가 주어짐. 3번의 기호를 놓치면 꽝! 맞추면 빙고! 출력
*/
public class Q2 {
  public static void main(String[] args) {
    System.out.println("1~10까지의 임의의 정수값 맞추기 (기회 3번)");
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int ca = random.nextInt(11);
    int count = 0;
    boolean isTrue = false;
    do {
      System.out.print("숫자 입력 : ");
      int answer = sc.nextInt();
      count++;
      System.out.println(count);
      if (count < 3) {
        if (answer < ca) {
          System.out.println("값이 더 큽니다");
          continue;
        } else if (answer > ca) {
          System.out.println("값이 더 작습니다");
          continue;
        } else {
          System.out.println("빙고!");
          isTrue = true;
          break;
        }
      }
    } while (count < 3);
    if (isTrue == false) {
      System.out.println("꽝입니다. 정답은 " + ca);
    }
      System.out.println("시스템 종료");
  }
}
