package DAY5;

// 배열의 정의 - 동일한 자료형의 여러 값을 하나의 변수로
// 그룹화하여 저장할 수 있는 데이터 구조
// 배열의 선언 - (데이터 타입)[] (변수명) = new (데이터타입)[(배열의 크기)];

//힙(Heap) 메모리에는 배열안에 있는 변수를 저장
//스택(Stack)에는 배열의 메모리 주소를 저장함
public class Test1 {
  public static void main(String[] args) {
//  배열의 선언
//    배열은 참조형(reference) 변수.
    int[] arr;
//  배열의 생성 및 초기화
//  초기화 : int => 0, double => 0.0, boolean => false, 참조형 => null
    arr = new int[3];

    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

//    arr[0] = "홍길동";
//    arr[1] = "엄복동";
//    arr[2] = "엄준식";
//
    System.out.println(arr);
    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);
    System.out.println("==");
//    배열참조변수.length - 배열의 길이
    System.out.println("arr.length = " + arr.length);

//  배열의 요소는 for문을 통해 순차적으로 접근할 수 있다.
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }

    System.out.println("==");

//  향상된 for 문
    for (int value : arr) {
      System.out.println(value);
    }
  }
}
