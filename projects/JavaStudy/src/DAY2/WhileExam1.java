package DAY2;

public class WhileExam1 {
  public static void main(String[] args) {
//    while
    int count = 0;
    while(count < 3) {
      System.out.println("hello");
      count = count + 1;
      count++;
    }
    System.out.println("=============");
// do~ while
    count = 0;
    do {
      System.out.println("hello");
      count = count + 1;
    } while(count < 3);
  }
}
