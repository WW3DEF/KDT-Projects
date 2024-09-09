package sec04_controllkeyword.EX02_ContinueControlKeyword;

public class ContinueControlKeyword {
  public static void main(String[] args) {
    // 단일 반복문에서 continue 사용
    for (int i = 0; i < 10; i++) {
        continue;
//      System.out.print(i + " ");
    }

    for (int i = 0; i < 10; i++) {
      System.out.print(i + " ");
      continue;
    }
    System.out.println(); //빈줄 출력

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        continue;
      }
      System.out.print(i + " ");
    }
    System.out.println();

    // 다중 반복문에서 continue 사용
   l1: for (int i = 0; i < 5; i++) {
      l2 : for (int j = 0; j < 5; j++) {
        if (j == 3) {
          continue l1;
        }
        System.out.println(i + ", " + j);
      }
    }
    System.out.println();
  }
}
