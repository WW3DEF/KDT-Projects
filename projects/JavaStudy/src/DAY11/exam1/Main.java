package DAY11.exam1;

public class Main {
  public static void main(String[] args) {
    Person person = new Person();
    System.out.println(System.identityHashCode(person));
    Student student = new Student();
    System.out.println(System.identityHashCode(student));
    HighStudent highStudent = new HighStudent();
    System.out.println(System.identityHashCode(highStudent));

    System.out.println(person.toString());
    System.out.println(person);
    System.out.println(person.getName());
    System.out.println(person.getAge());

    Student student2 = new Student("1234");
    student2.study();

    highStudent.takeEnteranceExam();
    highStudent.study();
  }
}
