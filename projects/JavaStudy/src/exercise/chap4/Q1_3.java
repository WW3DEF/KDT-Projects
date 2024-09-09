package exercise.chap4;

import java.util.Scanner;

// 문) 사용자로 부터 3개의 정수를 입력받아 총합과 평균을 구하는 프로그램을 구현하시오.
//
//      (단, 평균은 소수 2자리까지 표현)
// 정수1 :
// 정수2 :
// 정수3 :
// 총합 :
// 평균 :
// 계속(y/n) :
public class Q1_3 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println(">> 3개의 정수를 입력받아 총합,평균 구하는 프로그램 <<");

    for(;true;) {
      //정수 입력
      System.out.print("정수1 : ");
      int num1 = scanner.nextInt();
      System.out.print("정수2 : ");
      int num2 = scanner.nextInt();
      System.out.print("정수3 : ");
      int num3 = scanner.nextInt();

//    System.out.println("num1=" + num1);
//    System.out.println("num2=" + num2);
//    System.out.println("num3=" + num3);

      // 총합
      int sum = num1 + num2 + num3;
//    System.out.println("총합=" + sum);

      // 평균
      double average = (double) sum / 3;
//    System.out.printf("%.2f", average);

      System.out.printf("총합=%d, 평균=%5.2f\n", sum, average);
        
      scanner.nextLine();   // 다음 입력을 위한 줄바꿈 문자 소비
      
      System.out.print("계속(y/n) : ");
      String flag = scanner.nextLine();

      if (! (flag.equals("y") || flag.equals("Y")) ){
        break;
      }

//      if (!flag.equals("y") && !flag.equals("Y") ){
//        break;
//      }
    }
    System.out.println("프로그램 종료!");
  }
}
