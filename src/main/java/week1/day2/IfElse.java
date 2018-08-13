package week1.day2;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        // if(condition) statement;
        // else statement;

        Scanner scanner = new Scanner(System.in); // statement
        System.out.print("Enter your age - ");
        int age = scanner.nextInt();

        if(age >= 18 && age < 60) {
            System.out.println("You are adult");
        }

        if(age >= 60) {
            System.out.println("You are old");
        }

    }

}
