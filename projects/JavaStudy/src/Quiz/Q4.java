package Quiz;

import java.util.Scanner;

/*
 n개의 과목수를 입력받아 합계와 평균을 구하는 프로그램을 구현하시오.
 (단, 평균은 소수점 2자리 까지만 표현)
 과목수 : 3
 과목1 :
 과목2 :
 과목3 :
 합계 :   , 평균 :
 계속(y\n) y
 과목수 : 2
 과목1 :
 과목2 :
 합계:  , 평균 :
 계속(y\n) n
 프로그램 종료

 */
public class Q4 {
  public static void main(String[] args) {
    System.out.println("합계와 평균을 구하는 프로그램");
    Scanner sc = new Scanner(System.in);
    boolean stop = false;
    do {
      System.out.print("과목수 : ");
      int sub = sc.nextInt();
      int sum = 0;
      for (int i = 1; i <= sub; i++) {
        System.out.print("과목" + i + " : ");
        int score = sc.nextInt();
        sum += score;
      }

      double avg = average(sum, sub);
      System.out.printf("합계 : %d, 평균 : %.2f\n", sum , avg);

      System.out.print("계속(y/n) : ");
      String isYes = sc.next();

      if (isYes.equals("y") || isYes.equals("Y")) {
        stop = true;
      } else {
        break;
      };
    } while(stop); // while
    System.out.println("프로그램 종료!");
  } // main

//  평균을 구하는 메소드
  public static double average(double sum, double sub) {
      double avg = sum / sub;
    return avg;
  }
} // class
