package DAY5;

public class Test2 {
  public static void main(String[] args) {
    int[] arr = {10,20,30};

    System.out.println(arr);

    System.out.println(arr.length);

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    System.out.println("==");

    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("==");

    for (int ele : arr) {
      System.out.println(ele);
    }
  }
}
