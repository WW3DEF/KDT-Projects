package DAY9;
//import java.lang.*; 생략가능 - 컴파일러가 자동추가

public class Person {
//  속성
  String name; /* 이름 */
  int age; /* 나이 */

//  생성자 메소드
//  디폴트 생성자 : 매개변수(x), 실행문(x),
//  생략가능 - 컴파일러가 자동추가 ( 단, 생성자 메소드가 없을때 )
  Person() {  }

  Person(String name, int age) {
//    this : 미래에 만들어질 객체
//    this.name = name;
    this(name); /*현재 클래스의 다른 생성자메소드 호출, 첫문장에 위치해야한다.*/
    this.age = age;
//    this(age);
  }

  Person(String name) {
    this.name = name;
  }
  Person(int age) {
    this.age = age;
  }

  //  행위
  void smile() {
    System.out.println("웃다");
  }

  void eat() {
    System.out.println("먹다");
  }
}
