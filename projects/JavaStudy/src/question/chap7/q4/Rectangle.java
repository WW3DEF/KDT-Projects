package question.chap7.q4;

public class Rectangle {
  private double width; // 세로
  private double length; // 가로

  /**
   * 사각형 넓기 구하기
   * @return 넓이
   */
  double calculateArea() {
    return length * width;
  }

  /**
   * 사각형 둘레 구하기
   * @return 둘레
   */
  double calculatePerimeter() {
    return 2 * (length + width);
  }

  double getLength() {
    return length;
  }
  double getWidth() {
    return width;
  }

  /**
   * 가로 설정하기
   * @param length 가로
   */
  void setLength(double length) {
    this.length = length;
  }

  /**
   * 세로 설정하기
   * @param width 세로
   */
  void setWidth(double width) {
    this.width = width;
  }
}
