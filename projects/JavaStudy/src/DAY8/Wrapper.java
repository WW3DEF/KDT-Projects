package DAY8;

public class Wrapper {
  public static void main(String[] args) {
    String s = String.valueOf(10);
    String s2 = String.valueOf(3.14);
    String s3 = String.valueOf(true);

    System.out.printf("%s %s %s \n", s, s2, s3);

//    기본 타입의 값 문자열 => 기본타입
//    Wrapper클래스(Byte,Short,Character,Integer,Long,Float,Double,Boolean)
//    byte => Byte, short => Short, char => Character
//    int => Integer, long => Long
//    float => Float , double => Double
//    boolean => Boolean

    int x = Integer.parseInt(s);
    double y = Double.parseDouble(s2);
    boolean z = Boolean.parseBoolean(s3);

  }
}
