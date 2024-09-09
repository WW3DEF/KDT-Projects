package day1;

public class Test3 {
  public static void main(String[] args) {
    int x = 10;         //정수
    double y = 3.14;    //실수
    String z = "홍길동"; //문자열

    System.out.println(x);

    x = 20;  //재할당
    System.out.println(x);

     //x = 3.14; 정수형 변수에 정수값을 저장해야한다.

    y = 40;

    double i = x + y;
    System.out.println(i);
  }
}
