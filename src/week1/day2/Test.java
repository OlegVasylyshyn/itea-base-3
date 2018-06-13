package week1.day2;

public class Test {

    public static void main(String[] args) {

        int number = 12345;

        int sum = 0;
        while(number != 0){
            int lastNumber = number % 10;
            number = (number - lastNumber) / 10;
            System.out.println("last number - " + lastNumber);
            System.out.println("number - " + number);

            sum += lastNumber;
        }

        System.out.println(sum);

    }

}
