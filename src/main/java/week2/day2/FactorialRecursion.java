package week2.day2;

public class FactorialRecursion {

    public static void main(String[] args) {

        int result = f(3);
        System.out.println(result);

    }

    // Fn = n * F(n - 1);
    private static int f(int n) {
        return n <= 0 ? 1 : n * f(--n);
    }

}
