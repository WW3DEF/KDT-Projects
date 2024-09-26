package Quiz.q11;

import java.util.Arrays;
import java.util.Scanner;

public class MainV2 {
  private static Scanner scanner = new Scanner(System.in);
  private static Car[] cars = new Car[5];   // 구매차량정보
  private static Car[] garage = new Car[3]; // 차고지

  public static void main(String[] args) {
    boolean stop = false;
    while (!stop) {
      System.out.println("메뉴: 1.차량구매 2. 입고  3.출고 4.차고지현황 0.종료");
      System.out.print("선택 >> ");
      String menu = scanner.nextLine();

      String carNo = null;
      switch (menu) {
        case "1": //차량구매
          purchaseCar();
          break;
        case "2": // 입고
          System.out.print("차량번호 : ");
          carNo = scanner.nextLine();

          // 1) 차량번호 차량을 찾기
          Car car = findByCarNo(carNo);
          if (car == null) {
            System.out.println(carNo + "차량 정보가 없습니다.");
            continue;
          }
          // 2) 찾은차량을 차고지에 입고
          receiveCar(car);
          break;
        case "3": // 출고
          System.out.print("차량번호 : ");
          carNo = scanner.nextLine();

          // 차량번호 차량을 차고지에서 출고
          for (int i = 0; i < garage.length; i++) {
            if(garage[i] != null) {
              if(garage[i].getCarNo() == Integer.parseInt(carNo)){
                garage[i] = null;
                System.out.println(carNo+" 번호 차량을 " + i + "번 차고지에서 출고");
                System.out.println(Arrays.toString(garage));
              }
            }
          } // end of for

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

  /**
   * 차량 입고
   * @param car 입고할 차량
   * @return 입고여부
   */
  private static boolean receiveCar(Car car) {
    boolean isOk = false;
    for (int i = 0; i < garage.length; i++) {
      if (garage[i] == null) {
        garage[i] = car;
        isOk = true;
        System.out.println("차고지 " + i + "번에 입고되었습니다 ");
        break;
      }
    }
    if (!isOk) {
      System.out.println("입고할 공간이 없습니다.");
    }
    return isOk;
  }

  /**
   * 차량검색
   * @param carNo 차량번호
   * @return 검색된 차량
   */
  private static Car findByCarNo(String carNo) {
    for (int i = 0; i < cars.length; i++) {
      if(cars[i] != null){
        if (cars[i].getCarNo() == Integer.parseInt(carNo)) {
          return cars[i];
        }
      }
    }
    return null;
  }

  /**
   * 차량 구매
   */
  private static void purchaseCar() {
    System.out.print("색상 : ");
    String color = scanner.nextLine();
    System.out.print("제조사 : ");
    String maker = scanner.nextLine();

    // 차량생성
    Car car = new Car(color, maker);

    //구매차량정보 저장
    addCarInfo(car);
    System.out.println(car);
  }

  /**
   * 차량정보 추가
   * @param car
   */
  private static void addCarInfo(Car car) {
    for (int i = 0; i < cars.length; i++) {
      if( cars[i] == null){
        cars[i] = car;
        break;
      }
    }
  }
} // end of Class