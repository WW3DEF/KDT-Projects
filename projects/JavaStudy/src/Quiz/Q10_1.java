package Quiz;

import java.util.Arrays;
import java.util.Random;

// 문제 ) 배열 크기가 5인 1차원 배열에 임의의 정수값으로 초기화하고 최대값과 최소값을 구하시오.
public class Q10_1 {
  public static void main(String[] args) {
    Random random = new Random();
    int sizeOfArr = 10;
    int[] arr = new int[sizeOfArr];

    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100)+1;
    }
    System.out.println(Arrays.toString(arr));
    for (int i = 1; i < arr.length; i++) {
      if (max < arr[i]){
        max = arr[i];
      }
    }
    System.out.println("max="+max);

    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
      if(min > arr[i]){
        min = arr[i];
      }
    }
  }

  public static void minMax() {

    int x = 10;
    int y = 20;
    int z = 15;

    int max = x;
    if(max < y) {
      max = y;
    }
    if(max < z) {
      max = z;
    }
    System.out.println("max = " + max);

    int min = x;
    if(min > y) {
      min = y;
    }
    if(min > z) {
      min = z;
    }
    System.out.println("min = " + min);

  }
}
