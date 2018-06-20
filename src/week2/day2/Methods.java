package week2.day2;

public class Methods {

    public static void main(String[] args) {

        int result = sumTwoDigits(2, 3);
        System.out.println(result);


        System.out.println(fibonacci(7));

    }

    private static int sumTwoDigits(int a, int b) {
        return a + b;
    }

    private static int fibonacci(int num) {
        int f = 0;

        int f1 = 1;
        int f2 = 1;

        if(num <= 0) {
            return f;
        } else if(num < 3) {
            return f1;
        }

        while (num-- >= 3) {
            f = f1 + f2;
            f1 = f2;
            f2 = f;
        }
        return f;
    }

}
