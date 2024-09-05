package DAY2;
// 문 ) 1 ~ 3 까지의 합을 구하는 프로그램을 구현하시오.( 단 , do~while )
public class Test6 {
  public static void main(String[] args) {
    int count = 0;
    int sum = 0;

    do {
      count = count + 1;
      sum = sum + count;
    } while (count < 3);
    System.out.println("1 ~ 3까지의 합은 = " + sum);
  }
}
