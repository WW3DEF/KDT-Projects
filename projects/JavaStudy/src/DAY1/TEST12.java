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

        int SU = SUM(G,Y,S);
        System.out.println("총 합계 : " + SU);
        double AG = AVG(SU);
        System.out.println("평균 : " + AG);
    }
    public static int SUM(int g, int y, int s) {
        int sum = g + y + s;
        return sum;
    }
    public static double AVG(double sum) {
        double avg = sum / 3;
        return avg;
    }
}

// 1. 변수 - 하나의 값을 저장하기위해 메모리 특정공간에 붙여진 이름

// 2. 변수 선언 - ( 타입(자료형) ) ( 변수명 ) = 임의의 값 ex ) 정수(int)이면 10, 실수(float, double)이면 10.0, 문자열(String)이면 "KDT"
// 변수의 생명주기 - 변수가 선언된 블록내에서만 접근 가능

// 3. 변수의 초기화 - 변수 선언후 최초 값을 저장(대입,할당)하는 행위 ex ) int y; ( 변수 선언 ), y = 10; ( 변수 초기화 )

// 4. 재할당 - 변수의 초기화 이후 값을 수정하는 행위 ex ) y = 10; ( 초기화 ) y = 20; ( 재할당 )
// 자료형(=타입, 값의 종류) :
// 기본형(정수-(byte,short,char,int,long),실수-(float),논리(boolean))
// 참조형 - String

// 5. 메소드유형 - 4가지
// 메소드 - 입력값과 반환값을 갖는 실행문의 묶음

// 6. 연산자 - 산술 ( +(더하기) , -(빼기) , *(곱하기) , /(나누기), %(나머지) ) > 비교( >(크다) , <(작다), =(같다), >=(이상), <=(이하), !=(같지않음)) > 논리( &&((그리고)AND) , ||((또는)OR), !((부정)NOT), ^((배타적)XOR) > 대입(6)( = , +=,  -=, *=, /= )
// 우선순위 : 산술 > 비교 > 논리 > 대입
// 문자열 연결 연산자(+) - 피연산자중 하나라도 문자열이면 문자열 연산자로 동작, 삼항연산자 ( 조건식 ) ?  참 : 거짓;
// 증감연산자 : ++, --
// 부호연산자 : +, -
// 형변환연산자(casting): (자료형)
// 3항연산자 : (조건식) ? 실행문1 : 실행문2

// 7. 분기문(4) - 단순if, if~else, if~else-if, else, switch(break) 중첩분기문 가능

// 8. 반복문 - while문, do~while문, for문, 향상된 for문
//  break - ( 가장 가까운 반복문을 빠져나온다), continue(while,do~while문에서는 조건식으로 제어가 이동, for문에서는 증감식으로 제어가 이동)

// 9. Scanner(System.in) - 사용자로부터 화면입력을 받을때 사용

// 10. main메소드 = 실행메소드, 실행 클래스 : 실행메소드가 있는 클래스, 라이브러리 클래스 : 실행메소드가 없는 클래스
// 반환타입(string(문자열), boolean(참거짓), int(정수), void(반환값없음), double(실수)) 메소드명 ( 매개변수 ) { }

// 11. 패키지 : 클래스의 묶음

// 12. 매개변수(parameter) - 메소드가 호출될때 입력받는 변수, 메소드 내에서 지역변수로 사용된다.
//  매개값(=인자,argument) - 메소드 호출시 전달하는 값

// 13. 지역변수(local variable) - 메소드내에 선언된 변수