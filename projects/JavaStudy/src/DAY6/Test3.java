package DAY6;

public class Test3 {
  public static void main(String[] args) {
    int[][] arr = new int[2][3];
//    arr[0][0] = 0;
//    arr[0][1] = 1;
//    arr[0][2] = 2;
//    arr[1][0] = 10;
//    arr[1][1] = 11;
//    arr[1][2] = 12;
    System.out.println(arr);
    System.out.println(arr.length);

    System.out.println("===="); /* 열의 변수값(Heap 메모리 저장)을 참조하는 메모리 주소를 스택(Stack) 메모리에  */
    System.out.println(arr[0]); /* 행 1 */
    System.out.println(arr[1]); /* 행 2*/

    System.out.println("====");
    System.out.println(arr[0].length);
    System.out.println(arr[1].length);

    System.out.println("====");
    System.out.println(arr[0][0]);
    System.out.println(arr[0][1]);
    System.out.println(arr[0][2]);

    System.out.println("====");
    System.out.println(arr[1][0]);
    System.out.println(arr[1][1]);
    System.out.println(arr[1][2]);
  }
}
