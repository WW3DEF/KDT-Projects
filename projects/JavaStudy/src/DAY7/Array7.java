package DAY7;

//교육생명={김유진,김준우,박이담,이삼상,이휘재,장현승,정재만,홍정오}
// 2차원 비정방행열
import util.Line;

public class Array7 {
  public static void main(String[] args) {
    String[][] students = new String[4][];
    students[0] = new String[2];
    students[1] = new String[3];
    students[2] = new String[2];
    students[3] = new String[1];
    printElementValue(students);

    students[0][0] = "박이담";
    students[0][1] = "이휘재";

    students[1][0] = "김유진";
    students[1][1] = "홍정오";
    students[1][2] = "김준우";

    students[2][0] = "이삼상";
    students[2][1] = "정재만";

    students[3][0] = "장현승";

    Line.printLine('+', 20);
    printElementValue(students);

    String[][] students2 = new String[][]{
            {"박이담","이휘재"},
            {"김유진","홍정오","김준우"},
            {"이삼상","정재만"},
            {"장현승"}
    };
    Line.printLine('+', 20);
    printElementValue(students2);

    String[][] students3 = new String[4][];
    students3[0] = new String[]{"박이담","이휘재"};
    students3[1] = new String[]{"김유진","홍정오","김준우"};
    students3[2] = new String[]{"이삼상","정재만"};
    students3[3] = new String[]{"장현승"};

    Line.printLine('+', 20);
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
