package DAY11.exam1;
// 자바는 단일 상속만 된다. 즉 하나만 상속가능
public class Student extends Person{
  private String hackbun;

  public Student() {
//    super(); 부모 생성자 호출
  }
  public Student(String hackbun) {
//    super();
    this.hackbun = hackbun;
  }

  void study() {
    System.out.println("공부하다");
  }
}
