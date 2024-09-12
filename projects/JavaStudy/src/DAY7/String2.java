package DAY7;

public class String2 {
  public static void main(String[] args) {
    String str = "KH인a재교육a원";
//    System.out.println(str.length());

//    crtl + alt + v : 변수생성
    int length = str.length();
    System.out.println(length);

//    특정위치 문자 가져오기
    char ch = str.charAt(3);
    System.out.println(ch);

//    특정문자의 인덱스 위치 가져오기
    int idx = str.indexOf('a');
    System.out.println(idx);

    int idx2 = str.lastIndexOf('a');
    System.out.println(idx2);

    int idx3 = str.indexOf('a',4);
    System.out.println(idx3);

    int idx4 = str.indexOf('b');
    System.out.println(idx4);

//    문자열의 시작 인덱스
    int idx5 = str.indexOf("KH");
    System.out.println(idx5);

//    소문자 변환
    String str2 = "GoodMorning";
    String lowerCase = str2.toLowerCase();
    System.out.println(lowerCase);

//    대문자로 변환
    String upperCase = str2.toUpperCase();
    System.out.println(upperCase);

//    문자열 치환
    String replace = str2.replace("Morning", "Night");
    System.out.println(replace);

//    문자열 부분 추출
    String str3 = "KH인재교육원";
    String substring = str3.substring(2);
    System.out.println(substring);

    String substring1 = str3.substring(2, 4);
    System.out.println(substring1);
  }
}
