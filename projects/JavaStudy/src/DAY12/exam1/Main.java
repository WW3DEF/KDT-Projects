package DAY12.exam1;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    person.name = "홍길동";
    person.age = 10;
    person.calculator = new Calculator();
    person.calculator.calculate();
    person.calculator.battery.charge();

    System.out.println();
    Person.calculator.calculate();
  }
}