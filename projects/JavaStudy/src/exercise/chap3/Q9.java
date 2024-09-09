package exercise.chap3;

public class Q9 {
  public static void main(String[] args) {
    int a = 3;
    int b = 5;
    int c = 7;
    System.out.println((a > b) ? "안녕하세요" : "반갑습니다");
    // 3항연산자 중첩 가능
    System.out.println((a > b) ? (b < c) ? "타입 A" : "타입 B" : (b > c) ? "타입 C" : "타입 D");
  }
}
