package DAY7;

public class Test1 {
  public static void main(String[] args) {
    double result = (1 > 2) ? 1 : 2;
    System.out.println(result);

    String result2 = (1 > 2) ? "참" : "거짓";
    System.out.println(result2);

    double result3 = (1 > 2) ? 1 + 2 : 2 + 3;
    System.out.println(result3);

    int x = 10;
    double result4 = (1 > 2) ? 1 + 2 + x : 2 + 3 + x;
    System.out.println(result4);

    double result5 = (1 > 2) ? 1 + 2 + x : 2 + 3 + x + method1(method1(x));
    System.out.println(result5);

    double result6 = 0.0;

//    case 1)
    if (1 > 2) {
      result = 1;
    } else {
      result = 2;
    }

//    case 2) 실행문이 1개인 경우 블럭 생략 가능! 가독성이 떨어지므로 잘 사용하지 않는다.
    if (1 > 2) result = 1; else result = 2;


  }

  public static int method1 (int x) {
    return x + 10;
  }
}