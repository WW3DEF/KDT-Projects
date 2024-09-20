package question.chap7.q3;

public class Circle {
  double radius;

//  원의 반지름 반환
  double getRadius() {
    return radius;
  }
//  원의 면적
  double computeArea() {
    return radius * radius * Math.PI;
  }
//   원의 둘레
  double computePerimeter() {
    return 2 * Math.PI * radius;
  }
//    원의 반지름 값 설정
  void setRadius(double radius) {
    this.radius = radius;
  }
}
