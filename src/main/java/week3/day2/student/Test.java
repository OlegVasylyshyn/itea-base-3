package week3.day2.student;

import java.util.Scanner;

public class Test {

    private final int ADD_STUDENT = 0;
    private final int REMOVE_STUDENT = 1;

    private Scanner scanner = new Scanner(System.in);

    public void run(){

        System.out.println("Hello director");

        while (true) {
            System.out.println("Choose action. \n1 - Add student\n, 2 - Remove student\n");

            int n = 0;
            while (!scanner.hasNextInt()) {
                System.out.println("Error");
                scanner.next();
            }
            n = scanner.nextInt();
            System.out.println(n);

            int chosen = scanner.nextInt();
            switch (chosen) {
                case ADD_STUDENT :  break;
                case REMOVE_STUDENT : break;
                case 9 : {
                    System.out.println("bye");
                    return;
                }
            }
        }

    }

}
