package week2.day2;

public class Overloading {

    public static void main(String[] args) {

        System.out.println(sum(1, 2));
        System.out.println(sum(1, 2, 3));
        System.out.println(sum("1", "2"));

    }

    private static int sum(int a, int b) {
        return a + b;
    }

    private static int sum(Integer a, Integer b) {
        return a + b;
    }

    private static int sum(Object a, Object b) {
        return 1;
    }

    private static int sum(int a, int b, int c) {
        return a + b + c;
    }

    private static String sum(String a, String b) {
        return a + b;
    }

    private static int sum(int... numbers) {
        return 1;
    }

}
