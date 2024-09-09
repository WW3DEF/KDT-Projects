package DAY3;

import java.util.Scanner;

public class Practice01 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("---------------");
    System.out.println("메뉴 : 1. 사각형 2. 원 3. 종료");
    System.out.println("---------------");

    int aw = sc.nextInt();

    switch(aw){
      case 1:
        System.out.println("구하고자하는 도형 : 사각형");
        int wd = 20;
        int hg = 30;
        int et = wd * hg;
        System.out.println("가로 : " + wd);
        System.out.println("세로 : " + hg);
        System.out.println("넓이 : " + et);
        break;
      case 2:
        System.out.println("구하고자하는 도형 : 원");
        double pi = 3.14;
        double hf = 5;
        System.out.println("반지름 : " + hf);
        hf *= hf;
        double te = pi * hf;
        System.out.printf("넓이 : %.2f", te);
        break;
      case 3:
        System.out.println("프로그램 종료");
        break;
    }
  }
}
