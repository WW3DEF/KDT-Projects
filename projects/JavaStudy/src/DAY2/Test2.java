package DAY2;

public class Test2 {
    public static void main(String[] args) {

//      ((그리고)AND) && - 둘다 true 일때 true
        System.out.println( true && true ); /* true */
        System.out.println( false && false ); /* false */
        System.out.println( true && false ); /* false */
        System.out.println( false && true ); /* false */

        printstar(10);

//      ((또는))OR) || - 하나라도 true라면 true
        System.out.println( true || true ); /* true */
        System.out.println( false || false ); /* false */
        System.out.println( true || false ); /* true */
        System.out.println( false || true ); /* true */

        printstar(10);
//      ((부정)NOT) ! - 입력된 값에 반대되게 나옴
        System.out.println( !true ); /* false */
        System.out.println( !false ); /* true */

        printstar(10);
//      ((배타적 연산)XOR) ^ - 피연산자가 다르면 true ( 서로 값이 다르면 )
        System.out.println(true ^ true); /* false */
        System.out.println(false ^ false); /* false */
        System.out.println(true ^ false); /* true */
        System.out.println(false ^ true); /* true */

        printstar(10);
    }
    public static void printstar(int count) {
        for(int i = 0; i <= 10; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
