package Quiz;


import java.util.Arrays;
import java.util.Random;

/*
  교실내 교육생중 반장, 부반장 임의로 선출하는 프로그램을 구하시오.
  (단, 겸임 불가)
  교육생명={김유진,김준우,박이담,이삼상,이휘재,장현승,정재만,홍정오}
*/
public class Q7_2 {
  public static void main(String[] args) {
    Random random = new Random();

    String[] students = {"김유진","김준우","박이담","이삼상","이휘재","장현승","정재만","홍정오"};

    System.out.println(Arrays.toString(students));

//    반장선출
    int idx = random.nextInt(8);
    String person1 = students[idx];

//    부반장선출
    String person2 = null;
    boolean stop = false;
    while(!stop) {
      int idx2 = random.nextInt(8);
      person2 = students[idx2];
//    겸임 체크
      if(idx != idx2){
        stop = true;
        continue;
      }
    }

//    System.out.println("부반장 : " + person2);
    System.out.printf("반장 : %s, 부반장 : %s \n", person1, person2);
  }
}
