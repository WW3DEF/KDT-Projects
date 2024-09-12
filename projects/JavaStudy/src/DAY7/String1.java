package DAY7;
/*
  문자열 생성하는 2가지 방법
  1. ==
  2. new String()

  비교연산자 ==
    기본타입일때 : 값비교
    참조타입일때 : 주소값비교

  문자열비교는 equals()메소드 사용
*/
public class String1 {
  public static void main(String[] args) {
//    case1) 문자열을 리터럴 풀 영역에 생성
    String name = "홍길동";
    System.out.println(name);
    System.out.println(System.identityHashCode(name));
// 리터럴 풀에 동일 문자열이 있으면 새로이 생성하지 않고 참조
    String name2 = "홍길동";
    System.out.println(name2);
    System.out.println(System.identityHashCode(name2));

    if (name == name2) {
      System.out.println("참조 주소값이 같다");
    } else {
      System.out.println("참조 주소값이 다르다");
    }

//    case2) new 를 사용하면 무조건 새로이 생성.
    String name6 = new String("홍길동");
    System.out.println(name6);
    System.out.println(System.identityHashCode(name6));

    String name7 = new String("홍길동");
    System.out.println(name7);
    System.out.println(System.identityHashCode(name7));

//    주소값 비교 ( 참조 타입에서 == 주소를 비교한다. 기본 타입이 값을 비교 )
    if (name6 == name7) {
      System.out.println("참조 주소값이 같다");
    } else {
      System.out.println("참조 주소값이 다르다");
    }
//    문자열 비교
    if (name6.equals(name7)) {
      System.out.println("동일한 문자열");
    } else {
      System.out.println("다른문자열");
    }
  }
}
