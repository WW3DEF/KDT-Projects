package DAY2;

public class Test1 {

    public static void main(String[] args) {
        int result = add(10,20);
        System.out.println("결과값은=" + result);

        result = add(20, 30); /* 변수 재할당 */
        System.out.println("결과값은=" + result);

        System.out.println("결과값은=" + (minus(10, 5) + add(10, 20)));
    }

    public static int add (int x, int y) {

        return x + y;
    }
    public static int minus (int x, int y) {

        return x - y;
    }
    public static int multiply (int x, int y) {

        return x * y;
    }
    public static int devide (int x, int y) {

        return x / y;
    }

}
