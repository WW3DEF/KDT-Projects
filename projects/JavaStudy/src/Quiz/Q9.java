package Quiz;

import util.Line;

import java.util.Scanner;

/*
    >>영화관 좌석 예매 시스템 구현하기 <<

     1  2  3  4  5  6  7  8  9 10
    11 12 13 14 15 16 17 18 19 20
    21 22 23 24 25 26 27 28 29 30
    31 32 33 34 35 36 37 38 39 40
    41 42 43 44 45 46 47 X  49 50
    51 52 53 54 55 56 57 58 59 60

    영화관 좌석을 선택하세요 (1~60, 0:종료) >>
    1 예약된 좌석은 X로 표시
    2 예약된 좌석을 예매하려고 할때 '이미 예매되었습니다' 라는 메시지 출력하고
    다른 좌석을 선택하도록 유도한다.
 */
public class Q9 {
  public static void main(String[] args) {
    String[][] seats = new String[6][10];
    int number = 0;
    int answer = 0;

    Scanner scanner = new Scanner(System.in);
    for (int i = 0; i < seats.length; i++) {
      for (int j = 0; j < seats[i].length; j++) {
        seats[i][j] = ++number + "";
      }
    }
    do {
      System.out.println("=================================");
      System.out.println(">>영화관 좌석 예매 시스템 구현하기 <<");
      System.out.println("=================================");
      for (String[] seat : seats) {
        for (String s : seat) {
          System.out.printf("%3s", s);
        }
        System.out.println();
      }
      System.out.print("영화관 좌석을 선택하세요 (1~60, 0:종료) >> ");
      answer = scanner.nextInt();
      for (int i = 0; i < seats.length; i++) {
        for (int j = 0; j < seats[i].length; j++) {
          if (String.valueOf(answer).equals(seats[i][j])) {
            seats[i][j] = "X";
            break;
          } else if (seats[i][j].equals("X")) {
            System.out.println("이미 예매되었습니다. 다시 입력해주세요");
          } else if (answer == 0) {
            System.out.println("종료");
            break;
          }
        }
      }

    } while (true);
  }
}
