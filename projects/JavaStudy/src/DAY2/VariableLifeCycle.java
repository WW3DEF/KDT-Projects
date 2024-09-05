package DAY2;
/* 변수의 생명주기 - 변수를 선언한 블럭내에서만 접근 가능 */

public class VariableLifeCycle {
  public static void main(String[] args) {
    int x = 10;
    {
      {
        int y = 20;
        System.out.println(y);
        System.out.println(x);
        {
          int z = 30;
          System.out.println(x);
          System.out.println(y);
          System.out.println(z);
        }
      }
    }
  }
}
