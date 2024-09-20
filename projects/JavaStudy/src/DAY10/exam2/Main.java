package DAY10.exam2;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
//    person.name = "홍길동";
//    person.age = 10;
//    System.out.println(person.name);
//    person.name = "홍길순";
    System.out.println(person.getName());
    person.setName("홍길순");
    System.out.println(person.getName());
    int age = person.getAge();
    System.out.println(person.getAge());
    person.setAge(10);
    System.out.println(person.getAge());
    person.setAge(99);
    System.out.println(person.getAge());
  }
}
