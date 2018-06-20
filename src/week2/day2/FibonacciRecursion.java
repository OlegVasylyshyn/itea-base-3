package week2.day2;

public class FibonacciRecursion {

    public static void main(String[] args) {

        System.out.println("F(50) = " + f(50));

    }

    // F(n) = F(n -1) + F(n - 2)
    private static int f(int n) {
        return n < 3 ? 1 : f(n - 1) + f(n - 2);
    }

}
