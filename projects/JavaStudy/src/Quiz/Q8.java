package Quiz;
/*
  교실내 교육생중 반장, 부반장 임의로 선출하는 프로그램을 구현하시오.
 (단, 겸임 불가)
  데이터 구조 : 2차원 비정방행열
 */

import java.util.Random;

public class Q8 {
  public static void main(String[] args) {
    String[][] students2 = new String[][]{
            {"박이담","이휘재"},
            {"김유진","홍정오","김준우"},
            {"이삼상","정재만"},
            {"장현승"}
    };

    Random random = new Random();
    boolean stop = false;
    String person2 = "";
    int index = random.nextInt(students2.length);
    int index2 = random.nextInt(students2[index].length);
    String person1 = students2[index][index2];

    do {
      index = random.nextInt(students2.length);
      index2 = random.nextInt(students2[index].length);
      person2 = students2[index][index2];

      if (person1 != person2) {
        stop = true;
        break;
      }
    }while (!stop);
    System.out.println("반장 : " + person1);
    System.out.println("부반장 : " + person2);
  }
}
