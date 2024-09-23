package DAY11.exam1;

public class HighStudent extends Student{

  void study() {
    super.study();
    System.out.println("입시과외 공부하다");
  }
  void takeEnteranceExam() {
    System.out.println("입시를 치르다");
  }
}
