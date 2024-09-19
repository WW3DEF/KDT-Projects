package exercise.chap7.q3;

public class AMain {
  public static void main(String[] args) {
    A a = new A();
    int[] data1 = new int[]{1,2,3};
    int[] data2 = {1,2,3};

    System.out.println(a.arraySum(data1));
    System.out.println(a.arraySum(data2));
    System.out.println(a.arraySum(new int[]{1,2,3}));
//    System.out.println(a.arraySum({1,2,3})); 배열 선언과 생성을 분리할 수 없다.
  }
}
