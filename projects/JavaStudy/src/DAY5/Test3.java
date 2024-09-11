package DAY5;

public class Test3 {
  public static void main(String[] args) {
    method1();
    printStart("-",20);
    method2();
    printStart("-",20);
    method3();
  }

  // case 1 ) 개별 변수를 사용하여 국, 영, 수 합계와 평균 구하기

  public static void method1() {
    int kor = 90, eng = 80, math = 70;
    int sum = kor + eng + math;
    double average = (double)sum / 3;
    System.out.printf("합계=%d, 평균=%.2f\n", sum, average);
  }
  // case2) 배열을 사용하여 국, 영, 수 합계와 평균 구하기
  public static void method2() {
    int[] subjects = new int[3];
//    subjects[0] = 90;
//    subjects[1] = 80;
//    subjects[2] = 70;


      int sum = 0;
      for (int i = 0; i < subjects.length; i++) {
        sum += subjects[i]; /* sum = sum + subjects[i] */
      }
      double average = (double)sum / subjects.length;
      System.out.printf("합계=%d, 평균=%.2f\n", sum, average);
    }

  // case2) 배열을 사용하여 국, 영, 수 합계와 평균 구하기
  public static void method3() {
    int[] subjects;
    subjects = new int[]{90,80,70};


//    subjects[0] = 90;
//    subjects[1] = 80;
//    subjects[2] = 70;
  }
  // case2) 배열을 사용하여 국, 영, 수 합계와 평균 구하기
  public static void method4() {
    int[] subjects = {90,80,70};


//    subjects[0] = 90;
//    subjects[1] = 80;
//    subjects[2] = 70;

  }


  public static void printStart(String ch, int cnt) {
    for (int i = 0; i < cnt; i++) {
      System.out.print(ch);
    }
    System.out.println();
  }
}
