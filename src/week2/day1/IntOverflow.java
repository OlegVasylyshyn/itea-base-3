package week2.day1;

public class IntOverflow {

    public static void main(String[] args) {

        int n1 = 2_000_000_000;
        int n2 = 2_000_000_000;

        int average = (n1 + n2) >>> 1;
        System.out.println(average);

    }


}
