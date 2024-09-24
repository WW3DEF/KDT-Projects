package exercise.chap10.q3;

public class Main {
  public static void main(String[] args) {
    A a1 = new A();
    A a2 = new B();
    A a3 = new C();
    A a4 = new D();

//      B b1 = new A(); X(불가능)
    B b2 = new B();
//    B b3 = new C(); X (불가능)
    B b4 = new D();

//      C c1 = new A(); X (불가능)
//    C c2 = new B(); X (불가능)
    C c3 = new C();
//    C c4 = new D(); X (불가능)

//    D d1 = new A(); X (불가능)
//    D d2 = new B(); X (불가능)
//    D d3 = new C(); X (불가능)
    D d4 = new D();
  }
}
