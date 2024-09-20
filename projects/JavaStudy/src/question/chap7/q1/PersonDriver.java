package question.chap7.q1;

import java.util.Scanner;

public class PersonDriver {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("성을 입력하세요 : ");
    String lname = scanner.nextLine();
    System.out.print("이름을 입력하세요 : ");
    String fname = scanner.nextLine();
    Person person1 = new Person();
    person1.firstName = fname;
    person1.lastName = lname;
    System.out.println(person1.getLength());


    System.out.print("성을 입력하세요 : ");
    lname = scanner.nextLine();
    System.out.print("이름을 입력하세요 : ");
    fname = scanner.nextLine();
    Person person2 = new Person();
    person2.firstName = fname;
    person2.lastName = lname;
    System.out.println(person2.getLength());

  }
}
