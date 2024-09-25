package evaluation;

public class Car {
  private String color; // 색상
  private String maker; // 제조사
  private int carNumber; // 차량번호

  public Car(String color, String maker, int carNumber) {
    this.color = color;
    this.maker = maker;
    this.carNumber = carNumber;
  }

  public String getColor() {
    return color;
  }

  public String getMaker() {
    return maker;
  }

  public int getCarNumber() {
    return carNumber;
  }

  @Override
  public String toString() {
    return carNumber + "-" + color + "-" + maker;
  }

  void startEngine() {

  }

  void offEngine() {

  }

  void drive() {

  }
}
