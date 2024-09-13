package DAY7;
//2차원 비정방행렬
public class TQ3 {
  public static void main(String[] args) {
    String[][] name = {
            {"박이담","이휘재"},
            {"김유진","홍정오","김준우"},
            {"이삼상","정재만"},
            {"장현승"}
    };

    String[][] names1 = new String[][]{
            {"박이담","이휘재"},
            {"김유진","홍정오","김준우"},
            {"이삼상","정재만"},
            {"장현승"}
    };

    String[][] names2;
    names2 = new String[][]{
            {"박이담","이휘재"},
            {"김유진","홍정오","김준우"},
            {"이삼상","정재만"},
            {"장현승"}
    };
    String[][] names3 = new String[4][];
    names3[0] = new String[2];
    names3[1] = new String[3];
    names3[2] = new String[2];
    names3[3] = new String[1];

    names3[0][0] = "박이담";
    names3[0][1] = "이휘재";

    names3[1][0] = "김유진";
    names3[1][1] = "홍정오";
    names3[1][2] = "김준우";

    names3[2][0] = "이삼상";
    names3[2][1] = "정재만";

    names3[3][0] = "장현승";
  }
}
