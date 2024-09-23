package DAY11.exam3;

import util.Line;

public class Main {
  public static void main(String[] args) {
//    Person person = new Person();
    Student student = new Student();
//    student.
    Person person = new Student();

    Teacher teacher = new Teacher();
    Person person2 = new Teacher();

    person.eat();
    person2.eat();

    method1(person);
    method1(person);

    Line.printLine('-', 5);
    method1(new Student());
    Line.printLine('-', 5);
    method1(new Teacher());

  }

  public static void method1(Person person) {
    person.eat();
    System.out.println(person.name);

    if (person instanceof Student) {
      Student s = (Student)person;
      s.study();
    } else if (person instanceof Teacher) {
      Teacher t = (Teacher) person;
      t.teach();
    }
  }
}