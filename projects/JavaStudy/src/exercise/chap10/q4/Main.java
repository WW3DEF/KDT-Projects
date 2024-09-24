package exercise.chap10.q4;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int[] A = new int[N];
    int sum = 0;
    for (int i = 0; i < N; i++) {
      A[i] = scanner.nextInt();
    }
    int v = scanner.nextInt();
    for (int i : A) {
      if(v == i){
        sum++;
      }
    }
    System.out.println(sum);
  }
}
