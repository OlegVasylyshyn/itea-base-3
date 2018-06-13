package week1.day1;

public class Operators {

    public static void main(String[] args) {


        // +
        System.out.println(4 + 5);
        System.out.println(4 + 5.0);
        System.out.println("My age - " + 18);

        // -
        System.out.println(4 - 5);
        System.out.println(4 - 5.0);

        // *
        System.out.println(4 * 5);
        System.out.println(4 * 5.0);

        // /
        System.out.println(10 / 3);
        System.out.println(10 / 3.0);

        // %
        System.out.println(10 % 3);
        System.out.println(10 % 3.0);


        // unary operators
        int i = -10;
        System.out.println(- i);

        // pre-increment
        System.out.println(++i);
        // post-increment
        System.out.println(i++);
        System.out.println(i);

        // pre-decrement
        System.out.println(--i);
        // post-decrement
        System.out.println(i--);
        System.out.println(i);

    }

}
