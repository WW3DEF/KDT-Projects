package exercise.chap5;

import java.util.Arrays;

public class Q3 {
  public static void main(String[] args) {
    double[] a = {1.2, 3.4, 5.6};
    double[] b = a;
    b[0] = 7.0;
    System.out.println(Arrays.toString(a));
    System.out.println(Arrays.toString(b));


    String string = Arrays.toString(a);
    String string2 = Arrays.toString(b);
    System.out.printf("%s, %s", string, string2);
  }
}
