package week1.day2;

import java.util.Scanner;

public class ConditionalOperators {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // statement
        System.out.print("Enter your age - ");
        int age = scanner.nextInt();

        // expression + expression = statement 
        boolean isImmature = age > 0 && age < 18;
        System.out.println("You are immature - " + isImmature);

        isImmature = age < 0 || age > 100;
        System.out.println("Incorrect input - " + isImmature);


        System.out.println("XOR");
        System.out.println(false ^ true);


        String message = age > 18 ? "You are mature" : "You are immature";
        System.out.println(message);

    }


}
