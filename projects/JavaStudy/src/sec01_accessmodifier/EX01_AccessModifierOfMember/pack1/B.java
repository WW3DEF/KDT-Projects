package sec01_accessmodifier.EX01_AccessModifierOfMember.pack1;

public class B {
  public void print() {
//    객체 생성
    A a = new A();

//    멤버 활용
    System.out.println(a.a + " ");
    System.out.println(a.b + " ");
    System.out.println(a.c + " ");
//    System.out.println(a.d+ " ");
    System.out.println();
  }
}
