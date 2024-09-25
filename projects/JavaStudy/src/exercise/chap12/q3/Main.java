package exercise.chap12.q3;

import util.Line;

public class Main {
  public static void main(String[] args) {
    A a1 = new B();
    a1.abc();

    Line.printLine('-',10);

    A a2 = new A() {
      @Override
      void abc() {
        System.out.println("안녕하세요");
      }
    };
    a2.abc();

    A a22 = new A() {
      @Override
      void abc() {
        System.out.println("안녕하세요");
      }
    };
    a22.abc();

    A a23 = new A(){
      @Override
      void abc() {
      }
    };
  }
}