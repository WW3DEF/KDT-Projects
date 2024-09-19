package exercise.chap7.q4;

import java.util.Arrays;

public class AMain {
  public static void main(String[] args) {
    A a = new A();

    int m = 5;
    int[] n = {1,2,3};

    a.abc(m);
    a.bcd(n);

    System.out.println(m); // 5
    System.out.println(Arrays.toString(n)); // [4,5,6]
  }
}