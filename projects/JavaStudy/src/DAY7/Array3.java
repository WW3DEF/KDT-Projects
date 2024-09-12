package DAY7;

import util.Line;

public class Array3 {
  public static void main(String[] args) {
    int[][][] arr = new int[3][2][4];

    System.out.println(arr.length);
    System.out.println(arr[0].length);
    System.out.println(arr[0][0].length);

    Line.printLine('=', 10);

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        for (int k = 0; k < arr[i][j].length; k++) {
          System.out.print(arr[i][j][k] + " ");
        }
        System.out.println();
      }
      System.out.println();
    }
  }
}
