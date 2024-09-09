package day1;

public class Test7 {
  public static void main(String[] args) {
    int x = 10;
    double y = 3.14;
    String name = "홍길동";

    System.out.println( 10 + 20 ); //30
    System.out.println( 3 < 5);    //true
    System.out.println( 3 != 5);   //true

    System.out.println( 5 / 2);  // 몫 : 2
    System.out.println( 5 % 2);  // 나머지: 1

    System.out.println( (5 > 3) && (5 > 4));
    System.out.println( true && true);

    boolean status = 5 > 3 && 5 > 4;
    System.out.println(status);

    boolean status2 = (5 > (3 + 1)) && (5 > (4 + 1));
    System.out.println(status2);
  }
}
