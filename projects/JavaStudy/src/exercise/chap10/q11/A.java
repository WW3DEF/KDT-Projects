package exercise.chap10.q11;

import java.util.Objects;

public class A {
  int data;

  A(int data) {
    this.data = data;
  }
//
//  @Override
//  public boolean equals(Object obj) {
//    A a = null;
//    if (obj instanceof A) {
//      a = (A)obj;
//    } else {
//      return false;
//    }
//    return this.data == a.data;
//  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    A a = (A) o;
    return data == a.data;
  }
}