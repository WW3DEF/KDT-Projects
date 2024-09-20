package question.chap7.q1;

public class Person {
  String lastName; // 성
  String firstName; // 이름

  String getLastName() {
      return this.lastName;
  }
  String getFirstName() {
      return this.firstName;
  }

  int getLength() {
    return lastName.length()+firstName.length();
  }
}
