package Quiz;

import java.util.Random;

/*

  문 ) 로또 생성기(1~45)중 6개 출력(단, 중복불가)

*/
public class Q6 {
  public static void main(String[] args) {
    Random random = new Random();
    int[] numArray = new int[6];
    for (int i = 0; i < 6; i++) {
        numArray[i] = random.nextInt(45) + 1;
      System.out.println("lotto[" + i + "] = " + numArray[i]);
        if(i == 0){
          continue;
        }
      for (int j = 0; j < i; j++) {
        System.out.printf("i = %d, j = %d\n", i, j);

        if(numArray[i] == numArray[j]) {
          System.out.println("중복 발생" + numArray[i]);
          System.out.printf("i = %d, j = %d\n", i, j);
          i--;
          break;
        }
      }

////      System.out.println(num + " ||" + i);
//      System.out.println(numArray[i]);
    }
    for (int i : numArray) {
      System.out.println(i);
    }
  }
}