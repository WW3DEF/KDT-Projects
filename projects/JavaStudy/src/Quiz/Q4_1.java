package Quiz;

import java.util.Scanner;

public class Q4_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String yesOrNo = null;
    boolean stop = false;
    do {

//     과목수 입력
      System.out.print("과목수 : ");
      int countOfSubject = sc.nextInt();

//    합계 계산
      int sum = 0; // 합계
      for (int i = 0; i < countOfSubject; i++) {
        System.out.println("과목" + (i + 1) + " : ");
        sum += sc.nextInt();
      }

//    평균 계산
      double average = ((double)sum / countOfSubject);

//  출력 결과
      System.out.printf("합계 : %d, 평균 : %.2f\n", sum , average);

//    계속 여부확인
      System.out.print("계속(y/n) : ");
      yesOrNo = sc.nextLine();
      if (!yesOrNo.equalsIgnoreCase("y")) {
        stop = true;
        continue;
      }
//    } while( yesOrNo.equals("y") || yesOrNo.equals("Y") );
    } while(!stop);
  }
}