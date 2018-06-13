package week1.day2;

import java.util.Scanner;

public class RelationsOperators {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age - ");
        int age = scanner.nextInt();

        boolean isAdult = age >= 18;
        System.out.println("You are adult - " + isAdult);

    }


}
