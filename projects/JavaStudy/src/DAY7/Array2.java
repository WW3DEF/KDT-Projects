package DAY7;

import util.Line;

public class Array2 {
  public static void main(String[] args) {
    int[][] arr = new int[2][3];

    System.out.println(arr[0][0]);
    System.out.println(arr[0][1]);
    System.out.println(arr[0][2]);
    System.out.println(arr[1][0]);
    System.out.println(arr[1][1]);
    System.out.println(arr[1][2]);

    Line.printLine('=', 10);

    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[0][0]);

    Line.printLine('=', 10);

    System.out.println(arr.length);
    System.out.println(arr[0].length);
    System.out.println(arr[1].length);

    Line.printLine('=', 10);

    arr[1][1] = 10;

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.println(arr[i][j]);
      }
    }
  }
}
