package exercise.chap8.q6;

public class A {
  static int[] a; /*= new int[]{1,2,3};*/

//  static 필드를 초기화하는 용도
  static {
    a = new int[100];
    for (int i = 0; i < a.length; i++) {
      a[i] += ++i;
    }
  }
}
