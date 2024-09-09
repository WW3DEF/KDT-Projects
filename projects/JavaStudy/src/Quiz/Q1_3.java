package Quiz;

import java.util.Scanner;

/*
    도형의 넓이 구하기
    -------------------------
    메뉴 : 1. 사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 1
    가로 : 20
    세로 : 30
    넓이 : 600

    -------------------------
    메뉴 : 1. 사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 2
    반지름 : 5
    넓이 : ****

    -------------------------
    메뉴 : 1. 사각형 2.원 3.종료
    -------------------------
    구하고자하는 도형 : 3

    프로그램 종료!!

 */
public class Q1_3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean stop = false;
    while (!stop) {

      System.out.println("도형의 넓이 구하기");
      System.out.println("-------------------------");
      System.out.println(" 메뉴 : 1. 사각형 2. 원 3. 종료");
      System.out.println("-------------------------");
      System.out.print("구하고자하는 도형 : ");

      int menu = sc.nextInt();
//    System.out.println("menu" + menu);
      switch (menu) {
//    사각형 넓이 구하기
        case 1:
          System.out.print("가로 : ");
          int width = sc.nextInt();
          System.out.print("세로 : ");
          int height = sc.nextInt();

//      System.out.printf("width=%d, height=%d", width, height);
          System.out.println("넓이 : " + (width * height));
          break;
//      원의 넓이 구하기
        case 2:
          System.out.print("반지름 : ");
          int radius = sc.nextInt();
          System.out.println("넓이 = " + (radius * radius * 3.14));
          break;
//      종료
        case 3:
          stop = true;
          continue;
//        break;

        default:
          System.out.println("메뉴 선택범위는 1~3까지의 정수입니다.");
      }
    }
    System.out.println("프로그램 종료!!");
  }/*end of main*/
}
