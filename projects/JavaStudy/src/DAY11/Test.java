package DAY11;
/*
정수 10을 문자열 "10"로 반환하기
문자열 "10"을 정수형으로 반환하기
*/
public class Test {
  public static void main(String[] args) {
    int x = 10;

//    case1) String.value()사용
    String intToString = String.valueOf(x);
//    case2) "" : 빈문자열 사용
    String intToString2 = x + "";


//    문자열 "10"을 정수형으로 반환하기
//    Wrapper클래스 사용
    int stringToInt = Integer.parseInt(intToString);

//    문자열 "3.14"를 실수로 변환하기
    String str = "3.14";
    double stringToDouble = Double.parseDouble(str);

//    논리형 "true"를 논리형으로 변환하기
    String str2 = "true";
    boolean stringToBoolean = Boolean.parseBoolean(str2);
    System.out.println((stringToBoolean) ? "참" : "거짓");

    Integer z = 10;
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Integer.MIN_VALUE);
  }
}