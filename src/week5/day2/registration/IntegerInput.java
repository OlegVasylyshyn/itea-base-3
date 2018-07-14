package week5.day2.registration;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IntegerInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter you number - ");
        while (!scanner.hasNextInt()) {
            try {
                int num = scanner.nextInt();
                System.out.println("Success number - " + num);
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Was not number.");
                System.out.println("Try again. Enter your number");
            }
        }

    }

}
