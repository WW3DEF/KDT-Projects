package DAY2;
// 문제 ) 1 ~ 10 까지의 짝수의 합을 구하는 프로그램을 작성
public class Test5 {
  public static void main(String[] args) {

  int count = 0;
  int sum = 0;
  while(count < 10) {
    count = count + 1;

    if ( count % 2 == 0) {
      sum = sum + count;
    }
  }
    System.out.println("1 ~ 10까지의 합은 : " + sum);

  }
}
