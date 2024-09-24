package exercise.chap8.q5;

public class Main {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new A();

    a1.a = 30;
    a1.b = 40;

    a2.a = 50;
    a2.b = 60;

    System.out.println(a1.a);
    System.out.println(a1.b);

    System.out.println(a2.a);
    System.out.println(a2.b);

    int radius = 5;
    System.out.println( 5 * 5 * Math.PI);
  }
}
