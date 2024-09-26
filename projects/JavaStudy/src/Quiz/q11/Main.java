package Quiz.q11;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Car[] cars = new Car[5];   // 구매차량정보
    Car[] garage = new Car[3]; // 차고지

    boolean stop = false;
    while (!stop) {
      System.out.println("메뉴: 1.차량구매 2. 입고  3.출고 4.차고지현황 0.종료");
      System.out.print("선택 >> ");
      String menu = scanner.nextLine();

      String carNo = null;
      switch (menu) {
        case "1": //차량구매
          System.out.print("색상 : ");
          String color = scanner.nextLine();
          System.out.print("제조사 : ");
          String maker = scanner.nextLine();
          Car car = new Car(color, maker);

          //구매차량정보 저장
          for (int i = 0; i < cars.length; i++) {
            if( cars[i] == null){
              cars[i] = car;
              break;
            }
          }

          System.out.println(car);
          System.out.println(Arrays.toString(cars));
          break;
        case "2": // 입고
          System.out.print("차량번호 : ");
          carNo = scanner.nextLine();

          // 차량번호를 찾아서 차고지에 입고
          outer:
          for (int i = 0; i < cars.length; i++) {
            if(cars[i].getCarNo() == Integer.parseInt(carNo)){
              inner:
              for (int j = 0; j < garage.length; j++) {
                if(garage[j] == null) {
                  garage[j] = cars[i];
                  System.out.println(carNo+" 번호 차량을 " + j + "번 차고지에 입고");
                  System.out.println(Arrays.toString(garage));
                  break outer;
                }
              }
            }
          }

          break;
        case "3": // 출고
          System.out.print("차량번호 : ");
          carNo = scanner.nextLine();

          // 차량번호 차량을 차고지에서 출고
          boolean isExist = false;
          for (int i = 0; i < garage.length; i++) {
            if(garage[i] != null) {
              if(garage[i].getCarNo() == Integer.parseInt(carNo)){
                garage[i] = null;
                System.out.println(carNo+" 번호 차량을 " + i + "번 차고지에서 출고");
                System.out.println(Arrays.toString(garage));
                isExist = true;
              }
            }
          } // end of for
          if (!isExist) {
            System.out.println("차량번호 " + carNo + " 차량이 없습니다.");
          }
          break;
        case "4": // 차고지현황
          for (int i = 0; i < garage.length; i++) {
            String str = "차고지 " + i + "번: ";
            if(garage[i] == null) {
              System.out.println(str + "빈차고지");
            }else{
              System.out.println(str + garage[i]);
            }
          }
          break;
        case "0": // 종료
          stop = true;
          continue;
        default:
          System.out.println("메뉴 선택을 다시해주세요");
          continue;
      } // end of switch
    } // end of while
    System.out.println("프로그램 종료!!");
  } // end of main
} // end of Class