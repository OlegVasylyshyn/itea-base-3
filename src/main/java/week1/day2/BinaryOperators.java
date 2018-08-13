package week1.day2;

public class BinaryOperators {

    public static void main(String[] args) {

        // >>
        byte n1 = -0b1111111; //   01010
        byte n2 = 0b1010101;  //  00111

        System.out.println(">> - " + (n1 >> 2));

        // <<
        System.out.println("<< - " + (n2 << 1));

        // >>>
        System.out.println(">>> - " + (n1 >>> 2));

        // &
        System.out.println("& - " + (n2 & n1));

        // |
        System.out.println("| - " + (n2 | n1));

        // ^
        System.out.println("^ - " + (n2 ^ n1));

    }

}
