package DAY11.exam4;

public class Student extends Person{
  @Override
  void eat() {
    System.out.println("맛있게 먹다");
  }

  @Override
  void smile() {
    System.out.println("활짝 웃다");
  }
}