package exercise.chap5;
import java.lang.*;
// 문자열 String에 포함되는 라이브러리
// 자주 사용되는 것
public class Q8{
  public static void main(String[] args) {
    String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
    String name;
    int age;

    int pos1 = str.indexOf('[');
    int pos2 = str.indexOf(']');
    String substring = str.substring(pos1+1, pos2);
    str.substring(pos1, pos2);

    pos1 = str.lastIndexOf('[');
    pos2 = str.lastIndexOf(']');
    substring = str.substring(pos1+1, pos2);
    System.out.println(substring);

//    name = str.substring(7,10);
//    age = Integer.parseInt(str.substring(21,23));

//    System.out.println(name); // 홍길동
//    System.out.println(age); // 15
  }
}
