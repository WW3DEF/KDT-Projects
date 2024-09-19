package sec01_createobjectandusangeofmembers.EX01_CreateObjectAndUsageOfMembers;

public class CreateObjectAndUsageOfMembers {
  public static void main(String[] args) {
    A a = new A(); // 디폴트 생성자
    System.out.println(a.m);
    a.m = 5;
    System.out.println(a.m);
    a.print();
  }
}
