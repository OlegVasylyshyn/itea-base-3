package week1.day2;

import java.util.Scanner;

public class DecimalToBinary {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer number, please: ");
        int enteredNumber = scan.nextInt();
        String binaryNumber = "";
        int decimalNumber = 0;

        while (enteredNumber > 0) {
            if (enteredNumber % 2 == 0) {
                enteredNumber = enteredNumber / 2;
                binaryNumber += 0;
            } else {
                enteredNumber = enteredNumber / 2;
                binaryNumber += 1;
            }
        }

        System.out.println(binaryNumber);

        int d = 1;
        for (int i = 0; i < binaryNumber.length(); i++) {
            int k = Character.getNumericValue(binaryNumber.charAt(i));
            if(k != 0) k = d;
            decimalNumber += k;
            d = d * 2;
        }
        System.out.println(decimalNumber);

    }

}
