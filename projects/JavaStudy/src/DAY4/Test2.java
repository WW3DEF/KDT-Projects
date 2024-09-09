package DAY4;

import java.util.Random;

//임의의 정수출력하기
public class Test2 {
  public static void main(String[] args) {
    Random random = new Random();

    for (int i = 0; i < 10; i++) {

      int num = random.nextInt(101); /* 0~100까지의 임의의 정수 생성 */
      System.out.println("num = " + num);

    }
  }
}

