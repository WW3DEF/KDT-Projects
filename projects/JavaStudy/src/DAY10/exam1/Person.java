package DAY10.exam1;

import java.util.Date;

public class Person {
  String name;
  int age = 1;

  //  public Person(){
//    super();
//  }
  Person(String name) {
//    생성할객체의 name 속성 name를 대입
    this.name = name;
  }

  void smile() {
    System.out.println(name + "가 웃다");
  }
  void eat() {
    System.out.println(name + "가 먹다");
  }

  void getOld() {
    age++;
  }
  int getAge() {
    return age;
  }
}
