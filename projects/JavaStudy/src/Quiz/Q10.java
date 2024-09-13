package Quiz;

import java.util.Random;

// 문제 ) 배열 크기가 5인 1차원 배열에 임의의 정수값으로 초기화하고 최대값과 최소값을 구하시오.
public class Q10 {
  public static void main(String[] args) {
    int[] arr = new int[5];
    Random random = new Random();
    int max = 0;
    int low = 0;

    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100)+1;
      if( i == 0 ) {
        max = arr[i];
        low = arr[i];
      }
      else if (max < arr[i]) {
        max = arr[i];
      } else if (max > arr[i] && arr[i] < low) {
        low = arr[i];
      }

      System.out.println(arr[i]);
    }
    System.out.println("최대값은 : " + max);
    System.out.println("최소값은 : " + low);
  }
}
