package day1;

public class Test6 {
  public static void main(String[] args) {
//    System.out.println("***");
//    System.out.println("***");
//    System.out.println("***");
//    printStar();
//    printStar();
//    printStar();
//    for (int i = 1; i <= 3; i++) {
//      printStar();
//    }
    printStar2(10);
  }

  public static void printStar() {
    System.out.println("***");
  }

  public static void printStar2(int count){
    for (int i = 1; i <= count; i++) {
      System.out.print("*");
    }
    System.out.println();
  }


}
