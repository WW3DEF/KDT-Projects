package Quiz;

import java.util.Random;

/*

 교실내 우리반 교육생중 반장, 부반장 임의로 선출하는 프로그램을 구현하시오
 (단, 견임 불가)

*/
public class Q7 {
  public static void main(String[] args) {
    String[] name = {"박이담","장현승","이삼상",
            "정재만","김유진","홍정오", "김준우","이휘재"};

    int ban, buban;

    Random random = new Random();

    System.out.println("반장, 부반장 선출 프로그램");
    System.out.println("=======================");

    do {

        ban = random.nextInt(8);
        buban = random.nextInt(8);

    }while (buban == ban);
    System.out.println("반장 : " + name[ban]);

    System.out.println("부반장 : " + name[buban]);
  }
}
