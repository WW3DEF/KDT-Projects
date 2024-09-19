package exercise.chap7.q5;
// 가변길이 자료형 타입...  , 배열로 사용됨, 매개변수위치에서 제일 마지막에 위치해야함
public class A {

//  void averageScore(int score) {
//    System.out.println((double)score / 1);
//  }
//  void averageScore(int score, int score2) {
//    System.out.println((double)(score+score2) / 2);
//  }
//  void averageScore(int score, int score2, int score3) {
//    System.out.println((double)(score+score2+score3) / 3);
//  }
//  void averageScore(int score, int score2, int score3, int score4) {
//    System.out.println((double)(score+score2+score3+score4) / 4);
//    }
    void averageScore(int... v) {
//      System.out.println(v.length); // 매개값 갯수확인
//      for (int i = 0; i < v.length; i++) {
//        System.out.printf("%s ",v[i]);
//      }
//      System.out.println();
      int sum = 0;
      for (int i = 0; i < v.length; i++) {
        sum += v[i];
      }
      double average = (double)sum / v.length;
      System.out.printf("%.1f",average);
      System.out.println();
    }
}