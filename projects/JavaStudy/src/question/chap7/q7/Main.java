package question.chap7.q7;

public class Main {
  public static void main(String[] args) {
    Employee employee = new Employee();

    System.out.println(employee.getHourlyWages());
    employee.raise(1000);
    System.out.println(employee.getHourlyWages());
    System.out.println(employee.getPay(100));
    System.out.println(employee.getPay(170));

    Employee emp2 = new Employee("홍길동", "1234567890", "사원");
    double pay = emp2.getPay(120);
    System.out.println("pay="+pay);
  }
}
