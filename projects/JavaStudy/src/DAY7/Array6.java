package DAY7;

//2차원 정방행렬
//교육생명={김유진,김준우,박이담,이삼상,이휘재,장현승,정재만,홍정오}
import util.Line;

public class Array6 {
  public static void main(String[] args) {
    String[][] students = new String[2][4];
//    students[0][0] = "김유진";
//    students[0][1] = "김준우";
//    students[0][2] = "박이담";
//    students[0][3] = "이삼상";
//    students[1][0] = "이휘재";
//    students[1][1] = "장현승";
//    students[1][2] = "정재만";
//    students[1][3] = "홍정오";

    printElementValue(students);
    Line.printLine('+',30);

    String[][] students2 = new String[][]{
            {"김유진","김준우","박이담","이삼상"},
            {"이휘재","장현승","정재만","홍정오"}
    };
    printElementValue(students2);
    Line.printLine('+', 30);

    String[][] students3 = {
            {"김유진","김준우","박이담","이삼상"},
            {"이휘재","장현승","정재만","홍정오"}
    };
    printElementValue(students3);
  }

  public static void printElementValue(String[][] args) {
    for (int i = 0; i < args.length; i++) {
      for (int j = 0; j < args[i].length; j++) {
        System.out.printf("%-5s", args[i][j]);

      }
      System.out.println();
    }
    System.out.println();
  }
}
