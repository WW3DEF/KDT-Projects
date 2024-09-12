package Quiz;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*

  문 ) 로또 생성기(1~45)중 6개 출력(단, 중복불가)

*/
public class Q6_1 {
  public static void main(String[] args) {
    Random random = new Random();
    Scanner sc = new Scanner(System.in);
    System.out.print("생성할 로또 수 : ");
    int countOfLotto = sc.nextInt();
    int[] lotto = new int[6];
    for (int i = 0; i < countOfLotto; i++) {
      int cnt = 0;
      do {
        lotto[cnt] = random.nextInt(45) + 1; // 번호 생성
        if (cnt == 0) { // 인덱스 값이 0 일시 건너뜀
          continue;
        }
//      중복체크
        for (int j = 0; j < cnt; j++) {
          if (lotto[cnt] == lotto[j]) {
            cnt--;
            break;
          }
        }
      } while (++cnt != lotto.length);
//   로또 번호 배열 정렬

      Arrays.sort(lotto);
//    번호 배열 출력
      for (int number : lotto) {
        System.out.printf("%3d ",number);
      }
      System.out.println();
    }
  }
}