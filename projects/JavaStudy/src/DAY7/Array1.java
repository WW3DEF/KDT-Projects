package DAY7;

import util.Line;

public class Array1 {
  public static void main(String[] args) {
    int[] arr = new int[3];

    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    arr[1] = 10;

    for (int i = 0; i < arr.length; i++) {
      System.out.println("arr[" + i + "] = " + arr[i]);
    }

    Line.printLine('=', 10);
    int cnt = 0;
    for (int i : arr) {
      System.out.println("arr[" + cnt + "] = " + i);
      cnt++;
    }
  }
}