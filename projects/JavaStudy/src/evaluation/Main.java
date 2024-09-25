package evaluation;

import exercise.chap10.q2.C;
import util.Line;

import java.util.Scanner;

/*
  차고지에 차량을 최대 5대 주차 가능
  차량번호 중복 x 1,2,3 순차적으로 생성
 */
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Car[] car = new Car[10];
    int select = 0;
    String[] garage = new String[5];
    int carNumber = 0;
    int count = 1;
    String color = null;
    String maker = null;
    boolean stop = false;
    int index = 0;

    do {
      Line.printLine('-', 40);
      System.out.println("메뉴: 1. 차량구매 2. 입고 3. 출고 4.차고지현황 0.종료");
      Line.printLine('-', 40);
      System.out.print("선택 : ");
      select = scanner.nextInt();

      switch (select) {
        case 1:
          System.out.print("색상 : ");
          color = scanner.next();
          System.out.print("제조사 : ");
          maker = scanner.next();
          car[carNumber] = new Car(color, maker, count++);
          System.out.println(car[carNumber].getColor() + " " + car[carNumber].getMaker() + " " + car[carNumber].getCarNumber());
          carNumber++;
          System.out.println("차량번호 " + carNumber + "번 차량이 구매되었습니다");
          continue;
        case 2:
          // 만약 등록된 차량이 한 대도 없음에도 입고를 선택할 시 처리
//          if (car[0] == null) {
//            System.out.println("등록된 차량이 한 대도 없습니다");
//            break;
//          }
          System.out.print("차량번호 : ");
          carNumber = scanner.nextInt();
          for (int i = 0; i < garage.length; i++) {
            if (garage[i] == null || garage[i].equals("빈차고지")) {
              carNumber--;
              garage[i] = car[carNumber].toString();
              System.out.println("차고지" + i + "번에 입고되었습니다");
              break;
            } else if (garage[i] != null) {
              continue;
            }
          }
          continue;
        case 3:
          System.out.print("차량번호 : ");
          carNumber = scanner.nextInt();
          for (int i = 0; i < garage.length; i++) {
            if(garage[i].equals("빈차고지")){
              continue;
            } else if (carNumber == Integer.parseInt(garage[i].substring(0,1))) {
              garage[i] = "빈차고지";
              System.out.println("차고지 "+ i + "번에서 출고되었습니다. or 해당 차량이 존재하지 않습니다.\n");
              break;
            }
          }
          continue;
        case 4:
          index = 0;
          for (String s : garage) {
            System.out.println("차고지 " + index + " : "+s);
            index++;
          }
          continue;
        case 0:
          stop = true;
          break;
      }
    } while (!stop); // while
//    for (Car car1 : car) {
//      System.out.println(car1);
//    }
//    for (String s : garage) {
//      System.out.println(s);
//    }
  } // main
} // class