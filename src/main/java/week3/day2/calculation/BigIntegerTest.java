package week3.day2.calculation;

import java.math.BigDecimal;

public class BigIntegerTest {

    public static void main(String[] args) {

        BigDecimal n1 = new BigDecimal(10.0);
        BigDecimal n2 = new BigDecimal(3.0);

        BigDecimal divide = n1.divide(n2, 50, BigDecimal.ROUND_CEILING);
        System.out.println(divide);

    }

}
