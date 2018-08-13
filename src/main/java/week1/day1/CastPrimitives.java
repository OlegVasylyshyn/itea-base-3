package week1.day1;

public class CastPrimitives {

    public static void main(String[] args) {

        int intAge = 18;

        // implicit
        long longAge = intAge;

        // explicit
        longAge = 1111111111111111111L;
        intAge = (int) longAge;

        System.out.println(intAge);


        // 8 bytes
        double d = 1000000000;

        // 4 bytes
        float f = (float) d;
        System.out.println(f);

    }

}
