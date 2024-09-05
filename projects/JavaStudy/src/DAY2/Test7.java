package DAY2;

// 문)   1~10까지 총계를 출력하는 프로그램을 구현하시오.
// (단, for문, do~while, while문을 각각 이용)
public class Test7 {
  public static void main(String[] args) {

    int rs1 = useFor();
    int rs2 = useDoWhile();
    int rs3 = usewhile();

    System.out.println("result1 = " + rs1);
    System.out.println("result2 = " + rs2);
    System.out.println("result3 = " + rs3);
  }

  public static int useFor() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum+=i;
    }
    return sum;

  }

  public static int useDoWhile() {
    int i = 0;
    int sum = 0;
    do {
      i++;
      sum+=i;
    }while(i<10);
    return sum;
  }

  public static int usewhile() {
    int i = 0;
    int sum = 0;
    while (i < 10) {
      i++;
      sum+=i;
    }
    return sum;
  }
}
