  package Quiz;

import java.util.Scanner;

public class Q5_1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String yesOrNo = null;
    boolean stop = false;
    do {

//     과목수 입력
      System.out.print("과목수 : ");
      int countOfSubject = sc.nextInt();

//      과목점수 저장
      int[] subjects = new int[countOfSubject];
      for (int i = 0; i < subjects.length; i++) {
        System.out.print("과목" + (i + 1) + " : ");
        subjects[i] = sc.nextInt();
      }
//      과목점수 출력
      int sum = 0;
      for (int i = 0; i < subjects.length; i++) {
        System.out.println("과목" + (i + 1) + " : " + subjects[i] + "\n");
                sum += subjects[i];
      }
      double average = (double)sum / subjects.length;

//    과목 합계, 평균 출력
      System.out.printf("합계 : %d, 평균 : %.2f \n", sum, average);
      sc.nextLine();

      System.out.print("계속(y/n) : ");
      yesOrNo = sc.nextLine();

      if(!yesOrNo.equalsIgnoreCase("y")) {
        stop = true;
        continue;
      }
    } while(!stop);
  }
}