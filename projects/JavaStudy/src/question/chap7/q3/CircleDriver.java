package question.chap7.q3;

public class CircleDriver {
  public static void main(String[] args) {
      Circle cir = null;
      double area = 0.0, perm = 0.0;
//    (1) Circle 객체를 만들어 cir가 가리키게 한다.
      cir = new Circle();
//    (2) cir의 반지름을 5.0으로 변경한다.
//    cir.radius = 5.0;
      cir.setRadius(5.0);
//    (3) cir의 면적을 구하여 area에 저장한다.
      area = cir.computeArea();
//    (4) cir의 둘레를 구하여 perm에 저장한다.
      perm = cir.computePerimeter();
//    (5) area와 perm을 출력한다.
      System.out.printf("area : %.2f \n", area);
      System.out.printf("perm : %.2f \n", perm);
  }
}
