package day1;

public class Test8 {
  public static void main(String[] args) {
    // 단순 if문
    boolean status = true;
    if( method1() ){
      System.out.println("수행됨");
    }
    
    // if~else문
    if ( 6 % 2 == 0) {
      System.out.println("짝수");
    }else{
      System.out.println("홀수");
    }

    // 다중if문
    int score = 75;
    if( score >= 90){
      System.out.println("A");
    }else if(score >= 80){
      System.out.println("B");
    } else if (score >= 70) {
      System.out.println("C");
    } else if (score >= 60) {
      System.out.println("D");
    } else{
      System.out.println("F");
    }

//    System.out.println(97 / 10);//
    System.out.println("==========");

    // break: switch문에서 break를 만나면 switch문을 빠져나온다.
    switch (score / 10){
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 7:
        System.out.println("C");
        break;
      case 6:
        System.out.println("D");
        break;
      default:
        System.out.println("F");
    }
  }

  public static boolean method1(){
    return 5 > 4 + 0;
  }
}
