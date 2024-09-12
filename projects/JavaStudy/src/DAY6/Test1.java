package DAY6;
/*
1 byte = 8bit
1 bit = 0 , 1 ( 2진수 )
8bit = 2의 8승 = 256
1byte = 256

        (-2의 m-1승 ~ 2의 n-1승 - 1)
byte 범위 : -128    ~    127
*/
public class Test1 {
  public static void main(String[] args) {
    byte x = 127;
    x = -128;
//    x = 128;

    char ch = '가';
    String str = "a";

    System.out.println((int)ch);

    char ch2 = 97;
    System.out.println(ch2);

    long y = 0L;

//    int z = 3000000000;
    long z = 3_000_000_000L;

    double i = 3.14;
    float j = 3.14f;
  }
}