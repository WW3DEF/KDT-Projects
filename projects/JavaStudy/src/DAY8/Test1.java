
package DAY8;
/*
  메소드 오버로딩(다중정의) : 메소드명은 동일하고 매개변수를 다르게 정의할수 있는 문법
 */
public class Test1 {
  public static void main(String[] args) {

  }

  public static void printLine(){
    for (int i = 0; i < 10; i++) {
      System.out.print('*');
    }
  }

  public static void printLine(char ch) {
    for (int i = 0; i < 10; i++) {
      System.out.print(ch);
    }
  }

  public static void printLine(char ch,int cnt) {
    for (int i = 0; i < cnt; i++) {
      System.out.print(ch);
    }
  }

  public static void printLine(int count,char c) {
    for (int i = 0; i < count; i++) {
      System.out.print(c);
    }
  }



}
