package day1;

public class Test1 {
  public static void main(String[] args){
    // 순차
    System.out.println("hello world");
    System.out.println("hello world2");
    System.out.println("hello world3");
    
    // 분기
    int val = 11;
    if ( val % 2 == 1) {
      System.out.println("홀수");
    }else{
      System.out.println("짝수");
    }

    // 반복
    for (int i = 1; i <= 10; i++) {
      System.out.println("hello world"+i);
    }
    
  }
}
