package question.chap7.q7;

public class Employee {
   private String name; // 이름
   private String jdn; // 주민등록번호
   private String position; // 직위
   private int hourlyWages = 10_000; // 시간당 임금

  public Employee() {
  }

  public Employee(String name, String jdn, String position) {
    this.name = name;
    this.jdn = jdn;
    this.position = position;
  }

  /**
   * 임금 계산하기
   * @param hours 시간
   * @return 임금
   */
  double getPay(int hours) {
    double salary = hours * hourlyWages;
    if (hours > 160) {
      salary += (hours - 160) * 1.5 * hourlyWages;
    }
    return salary;
  }

  void raise(int amount) {
    if (amount < 0) {
      amount = -amount;
    }
    if(hourlyWages <= amount){
      System.out.println("증감 또는 감액할수 없다.");
      return;
    }
    this.hourlyWages += amount;
  }

  public int getHourlyWages() {
    return hourlyWages;
  }
}
