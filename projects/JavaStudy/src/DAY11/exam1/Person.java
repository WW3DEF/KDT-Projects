package DAY11.exam1;
//java.lang.*; 자주 사용되니 기본적으로 생략된다.
// 상속되지 않은 클래스는 기본적으로 Object를 상속받는다.
// 모든 클래스중에 Object클래스가 항상 최상위에 있는다.
public class Person  extends Object /* (기본적으로 생략) */{
  private String name;
  private int age;

  //  Person() {
//    super();
//  }
  void smile() {
    System.out.println(name+"가 웃다");
  }

  void eat() {
    System.out.println(name+"가 먹다");
  }

  public String toString() {
    return "이름 : " + name + " " + "나이 : " + age;
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }
}
