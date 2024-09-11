package Quiz;
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

import java.util.Scanner;

public class Q5 {
  public static void main(String[] args) {
    String yesOrNo = null;
    boolean stop = false;
    Scanner sc = new Scanner(System.in);
    System.out.println("과목점수 합계와 평균 구하기 ( 과목수 제한 : 10개 이상 )");
    do {
      System.out.print("과목수 : ");
      int sum = 0; /* 합계에 사용되는 변수 */
      double avg = 0; /* 평균에 사용되는 변수 */
      int[] countSubjects; /* 과목수 배열변수 */
      int[] subjectScore; /* 과목점수 배열변수 */

      countSubjects = new int[sc.nextInt()]; /* 배열크기는 입력값에따라 */

      if (countSubjects.length >= 10) {
        System.out.println("과목수가 너무 많습니다. 다시 입력해주십시오");
        continue;
      }
      subjectScore = new int [countSubjects.length];
      for (int i = 0; i < countSubjects.length; i++) {
        countSubjects[i] = i+1;
        System.out.print("과목" + countSubjects[i] + " : ");
        subjectScore[i] = sc.nextInt();
      }
      sum = sumMethod(subjectScore, sum);
      avg = averageMethod(sum, countSubjects.length);
      System.out.printf("합계 : %d , 평균 : %.2f\n", sum, avg);

      System.out.print("계속(y/n) : ");
      yesOrNo = sc.next();

      if (!yesOrNo.equalsIgnoreCase("y")) {
        stop = true;
        continue;
      }
    } while(!stop); // while
  } // main
  public static int sumMethod(int[] subjectScore, int sum) {
    for (int i : subjectScore) {
      sum += i;
    }
    return sum;
  }
  public static double averageMethod(int sum, int countSubject)
    {
      double avg = (double)sum/countSubject;

      return avg;
    }
} // class
