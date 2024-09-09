package DAY3;
// 3항 연산자
public class Test3 {
  public static void main(String[] args) {
    int x = 11;
    
    if ( x % 2 == 0) {
      System.out.println("짝수");
    }else{
      System.out.println("홀수");
    }

    String result = ( x % 2 == 0 ) ? "짝수" : "홀수";
    System.out.println(result);

    String result2 = method1(x);
    System.out.println(result2);

    String result3 = method2(x);
    System.out.println(result3);
  }

  public static String method1(int val) {

    String result ;
    if (val % 2 == 0) {
      result = "짝수";
    }else{
      result = "홀수";
    }
    return result;
  }
  public static String method2(int val) {

    String result ;
    result = (val % 2 == 0) ? "짝수" : "홀수";
    return result;

  }
}
