package Quiz;

import java.util.Arrays;
import java.util.Random;

// 문제 ) 배열 크기가 3인 1차원 배열에 임의의 정수값으로 초기화하고 최대값과 최소값을 구하시오.
public class Q10_2 {
  public static void main(String[] args) {
    Random random = new Random();
//    배열 선언 및 초기화
    int[] arr = new int[3];
// 임의의 정수값 재할당
    for (int i = 0; i < arr.length; i++) {
      arr[i] = random.nextInt(100) + 1;
    }
//    배열요소 문자열 출력
    System.out.println(Arrays.toString(arr));
//  최대값, 최소값 출력
    System.out.printf("max=%d, min=%d", max(arr), min(arr));
  }

  /**
   * 최소값 구하기
   * @param arr 1차원 정수 배열
   * @return 최소값
   */
  public static int min(int[] arr) {
    int min = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(min > arr[i]){
        min = arr[i];
      }
    }
    return min;
  }

  /**
   * 최대값 구하기
   * @param arr 1차원 정수 배열
   * @return 최대값 반환
   */
  public static int max(int[] arr) {
    int max = arr[0];
    for (int i = 0; i < arr.length; i++) {
      if(max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
}
