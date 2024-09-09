package DAY3;
// 증감연산자 (++, --) : 단독으로 사용될때와 식에 참여할때 의미가 달라진다.
   
// ++x, --x : 전위 증감 연산자 - 자신의 값을 먼저 증감후 식에 참여 
// x++, x-- : 후위 증감 연산자 - 식에 참여후 자신의 값을 증감
public class Test1 {
  public static void main(String[] args) {
    int x = 10;
    System.out.println(x);
    ++x;  // x = x + 1   , x += 1;
    System.out.println(x);
    x++; // x = x + 1   , x += 1;
    System.out.println(x);
    --x; // x = x - 1   , x -= 1;
    System.out.println(x);
    x--; // x = x - 1   , x -= 1;
    System.out.println(x);

    int y = 20;
    int z = 0;

    z = ++y; // y = y + 1, y += 1

    System.out.println("y=" + y); // 21
    System.out.println("z=" + z); // 21

    z = y++; // y = y + 1, y += 1

    System.out.println("y=" + y); // 22
    System.out.println("z=" + z); // 21

  }
}

