package week1.day2;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        // works with primitives, string, enums
        // switch(var)
        // case value : statement; break;
        // case value : statement; break;
        // case value : statement; break;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age - ");
        int age = scanner.nextInt();

        switch (age) {
            case 0:
                System.out.println("You has been already born");
                break;
            case 18:
                System.out.println("You are adult");
                break;
            case 65:
                System.out.println("You are old");
                break;
            default:
                System.out.println("Nothing special");
                break;
        }

    }

}
