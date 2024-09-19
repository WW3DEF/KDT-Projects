package DAY9;
//import java.lang.*;

import util.Line;

public class PersonMain{
  public static void main(String[] args) {
    Person p1;
    p1 = new Person();

    System.out.println(p1.name);
    System.out.println(p1.age);

    p1.eat();
    p1.smile();

    Person p2 = p1;
    Person p3 = new Person();

    System.out.println(System.identityHashCode(p1));
    System.out.println(System.identityHashCode(p2));
    System.out.println(System.identityHashCode(p3));

    System.out.println(p2.name);
    System.out.println(p2.age);

    p2.eat();
    p2.smile();

    p1.name = "홍길동";
    p1.age = 20;

    p3.name = "홍길순";
    p3.age = 30;

    Person p4 = new Person("홍길서", 40);
    Person p5 = new Person("홍길남");
    Person p6 = new Person(50);

    Line.printLine('-',10);
    p4.smile();
    p5.smile();
    p6.smile();
  }
}