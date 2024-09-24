package DAY12.exam2;

public class ApplePhone extends Phone{
  @Override
  void on() {
    System.out.println("ApplePhone 을 켜다");
  }

  @Override
  void off() {
    System.out.println("ApplePhone 을 끄다");
  }
}
