package DAY1;

import java.util.Scanner;

// 국,영,수 점수를 입력받아 총계와 평균을 구하는 프로그램을 구현
public class TEST12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("국어 점수 입력 : ");
        int G = scanner.nextInt();
        System.out.print("영어 점수 입력 : ");
        int Y = scanner.nextInt();
        System.out.print("수학 점수 입력 : ");
        int S = scanner.nextInt();

        int sum = G + Y + S;
        System.out.println("총 합계 : " + sum);
        int avg = sum / 3 ;
        System.out.println("평균 : " + avg);
    }
}