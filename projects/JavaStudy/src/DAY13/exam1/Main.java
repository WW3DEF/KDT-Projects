package DAY13.exam1;

public class Main {
  public static void main(String[] args) {
    AirPlane airPlane = new AirPlane();
    Flyable airPlane2 = new AirPlane();

    airPlane.fly();
    airPlane2.fly();
    airPlane.method1();

    Flyable.method2();
  }
}
