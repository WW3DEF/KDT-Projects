package DAY2;
// 문) 구구단중 3단을 출력하는 프로그램을 구현하시오. ( for문 이용 )
public class Gugudan {
  public static void main(String[] args) {
//    for (int i = 1; i < 10; i++) {
//      System.out.println(" 3 * " + i + " = " + (3 * i));
//    }
    for (int i = 1; i <= 5; i++) {
      System.out.print("*");
      for (int j = 1; j <= 5; j++) {
        System.out.println("*");
      }
    }
  }
}
