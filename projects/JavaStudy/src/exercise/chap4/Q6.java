package exercise.chap4;

public class Q6 {
  public static void main(String[] args) {

    boolean stop = false;

    for (int i = 0; i < 10; i++) {
//    참이 된 stop은 if문에 있는 break문을 수행 -> 반복문 탈출
      if (stop) {
        break;
      }

      for (int j = 0; j < 5; j++) {
//      조건이 충족되면서 stop을 참으로 재할당;
        if (i == 3 && j == 2) {
          stop = true;
          break;
        }
        System.out.printf("i=%d, j=%d\n", i, j);
      }
    }
  }
}
