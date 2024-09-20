package DAY10.exam1;

import util.Line;

public class Main {

//  public Main(){}
  public static void main(String[] args) {
    Person p1 = new Person("홍길동");
    System.out.println(p1);
    System.out.println(System.identityHashCode(p1));

    p1.smile();

    Person p2 = new Person("홍길순");
    p2.smile();

    Person[] persons = new Person[3];
    persons[0] = new Person("홍길서");
    persons[1] = new Person("홍길남");
    persons[2] = new Person("홍길북");

    for (Person person : persons) {
      person.smile();
    }

    Line.printLine('-',10);
    System.out.println(p1.getAge());
    p1.getOld();
    System.out.println(p1.getAge());
  }
}