package DAY11.exam5;
//static
public class Main {
  public static void main(String[] args) {
    Person.addCnt();
    Person.addCnt();
    System.out.println(Person.cnt); /* 2 */

    Person p = new Person();
    p.addAge();
    p.addAge();
    System.out.println(p.age); /* 2 */
    System.out.println(p.cnt); /* 2 */

    Person p2 = new Person();
    p2.addAge();

    System.out.println(p2.age); /* 1 */
    System.out.println(p2.cnt); /* 2 */
  }
}
