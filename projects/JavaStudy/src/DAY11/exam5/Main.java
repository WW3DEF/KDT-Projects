package DAY11.exam5;
//static
public class Main {
  public static void main(String[] args) {
    Person p = new Person();
    p.addAge();
    p.addAge();

    Person p2 = new Person();
    p2.addAge();

    Person.addCnt();
    Person.addCnt();
    System.out.println(Person.cnt);
  }
}
