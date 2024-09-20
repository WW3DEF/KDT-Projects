package question.chap6.q1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    CalculateProduct cProduct = new CalculateProduct();
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();


    int prod1 = cProduct.product1(a,b);
    int prod2 = cProduct.product2(a,b);
    int prod3 = cProduct.product3(a,b);

    System.out.println(prod1);
    System.out.println(prod2);
    System.out.println(prod3);
  }
}
