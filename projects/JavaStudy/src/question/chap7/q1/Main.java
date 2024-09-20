package question.chap7.q1;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();

    person.lastName = "홍";
    person.firstName = "길동";

    String lastName = person.getLastName();
    String firstName = person.getFirstName();
    int length = person.getLength();

    System.out.println(lastName);
    System.out.println(firstName);
    System.out.println(length);
  }
}
