package DAY2;
// 문제 ) 1 ~ 3 까지의 합을 구하는 프로그램을 작성
public class Test4 {
  public static void main(String[] args) {

  int count = 0;
  int sum = 0;
  while(count < 3) {
    count = count + 1;
    sum = sum + count;
  }
    System.out.println("1 ~ 3까지의 합은 : " + sum);
  }
}
