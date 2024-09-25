package DAY13.exam1;

public class AirPlane implements Flyable {
  @Override
  public void fly() {
    System.out.println("비행기 날다");
  }

  @Override
  public void method1() {
    System.out.println("Airplane에서 재정의함");
  }
}