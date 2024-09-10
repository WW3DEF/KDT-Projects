package exercise.chap4;

public class Q7 {
  public static void main(String[] args) {
    label1:
    for (int i = 0; i < 10; i++) {
      label2:
      for (int j = 0; j < 5; j++) {
        if (i == 3 && j == 2) {
          break label1;
        }
        System.out.printf("i=%d, j=%d \n", i, j);

      }
    }
  }
}
