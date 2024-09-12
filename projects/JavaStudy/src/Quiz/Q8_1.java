package Quiz;
/*
  교실내 교육생중 반장, 부반장 임의로 선출하는 프로그램을 구현하시오.
 (단, 겸임 불가)
  데이터 구조 : 2차원 비정방행열
 */

import java.util.Random;

public class Q8_1 {
  public static void main(String[] args) {
    String[][] students2 = new String[][]{
            {"박이담","이휘재"},
            {"김유진","홍정오","김준우"},
            {"이삼상","정재만"},
            {"장현승"}
    };
//
//    System.out.println(students2.length);
//    System.out.println(students2[0].length);
//    System.out.println(students2[1].length);
//    System.out.println(students2[2].length);
//    System.out.println(students2[3].length);

    Random random = new Random();
    int row = random.nextInt(students2.length); /* 0 <= ? < students.length*/
    int col = random.nextInt(students2[row].length);
    String name1 = students2[row][col]; /* 반장 이름 */
    System.out.println("반장 : " + name1);

    boolean stop = false;
    while(!stop) {
      int row2 = random.nextInt(students2.length); /* 0 <= ? < students.length*/
      int col2 = random.nextInt(students2[row2].length);

      if (!(row == row2 && col == col2)) {
        System.out.println("부반장 : " + students2[row2][col2]);
        stop = true;
        continue;
      }
    }
  }
}
