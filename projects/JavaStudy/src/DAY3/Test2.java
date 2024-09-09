package DAY3;

public class Test2 {
  public static void main(String[] args) {
    int x = 10;
    int y = 0;

//    y =  10 + ++x;
//    System.out.println("x=" + x); // 11
//    System.out.println("y=" + y); // 21

    y =  10 + x++;
    System.out.println("x=" + x); // 11
    System.out.println("y=" + y); // 20
  }
}
