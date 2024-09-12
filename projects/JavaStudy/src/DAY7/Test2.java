package DAY7;

public class Test2 {
  public static void main(String[] args) {
    for (int i = 0; i < args.length; i++) {
      System.out.println(args[i]);
    }
    String value1 = args[0];
    String value2 = args[1];
    String value3 = args[2];

    System.out.printf("%s, %s, %s", value1, value2, value3);
  }
}
