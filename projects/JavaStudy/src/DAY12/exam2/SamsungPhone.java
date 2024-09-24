package DAY12.exam2;

public class SamsungPhone extends Phone{
  @Override
  void on() {
    System.out.println("SamsungPhone 을 켜다");
  }

  @Override
  void off() {
    System.out.println("SamsungPhone 을 끄다");
  }
}
