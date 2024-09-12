package DAY7;
/*
  비정방행렬
*/
public class Array4 {
  public static void main(String[] args) {
    int[][] array = new int[4][];

    System.out.println(array);
    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);

    System.out.println(array.length);
//    System.out.println(array[0].length); 값을 참조하고 있지 않기에 NullPointerException 오류가 뜬다

    array[0] = new int[]{8,9};
    System.out.println(array[0].length);

    array[1] = new int[]{1,2,3,4};
    array[2] = new int[]{6,7,8};
    array[3] = new int[]{1};

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array[i].length; j++) {
        System.out.print(array[i][j] + " ");
      }
      System.out.println();
    }
  }
}
