package sec01_accessmodifier.EX01_AccessModifierOfMember.pack2;

import sec01_accessmodifier.EX01_AccessModifierOfMember.pack1.A;

public class D extends A {
  public void print() {
//    멤버 활용
    System.out.println(a + " ");
    System.out.println(b + " ");
//    System.out.println(c + " ");
//    System.out.println(d+ " ");
    System.out.println();
  }
}