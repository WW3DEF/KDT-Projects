package Quiz.q11;
/*
자동차
  속성 : 색상,제조사,차량번호
  행위 : 시동걸다, 시동끄다, 운행하다
 */

public class Car {
  private String color; //색상
  private String maker; //제조사
  private int carNo;    //차량번호

  private static int cntOfCar; //차량번호 카운터

  public Car(String color, String maker) {
    this.color = color;
    this.maker = maker;
    this.carNo = ++cntOfCar;
  }

  void startEngine() {
    System.out.println("시동걸다");
  }

  void stopEngine() {
    System.out.println("시동끄다");
  }

  void drive() {
    System.out.println("운행하다");
  }

  @Override
  public String toString() {
    return this.carNo + "-" + this.color + "-" +this.maker;
  }

  public int getCarNo() {
    return carNo;
  }
}