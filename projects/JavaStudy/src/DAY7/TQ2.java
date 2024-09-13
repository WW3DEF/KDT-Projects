package DAY7;
//교육생명={김유진,김준우,박이담,이삼상,이휘재,장현승,정재만,홍정오}
// 2차원 배열
public class TQ2 {
  public static void main(String[] args) {
    String[][] names = new String[2][4];

    String[][] names1 = new String[][]{
      {"김유진","김준우","박이담","이삼상"},
      {"이휘재","장현승","정재만","홍정오"}
    };

    String[][] names2 = {
            {"김유진","김준우","박이담","이삼상"},
            {"이휘재","장현승","정재만","홍정오"}
    };

    names[0][0] = "김유진";
    names[0][1] = "김준우";
    names[0][2] = "박이담";
    names[0][3] = "이삼상";
    names[1][0] = "이휘재";
    names[1][1] = "장현승";
    names[1][2] = "정재만";
    names[1][3] = "홍정오";

  }
}
