package week2.day2;

public class VarargsTest {

    public static void main(String... args) {

        int sum = sum(1, 2, 3, 4);
        System.out.println(sum);


        double d = 4.7777;
        String format = String.format("Result was - %.3f. Some string - %s", d, "wer");
        System.out.println(format);


    }


    private static int sum(int... numbers) {
        int sum = 0;
        for (int tmp : numbers) {
            sum += tmp;
        }
        return sum;
    }

}
