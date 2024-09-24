package DAY12.exam2;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person(new ApplePhone());
    Person p2 = new Person(new SamsungPhone());

    p1.phone.on();
    p2.phone.on();

  }
}
