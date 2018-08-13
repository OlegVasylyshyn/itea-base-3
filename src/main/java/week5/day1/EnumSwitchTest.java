package week5.day1;

import java.util.Scanner;

public class EnumSwitchTest {

    public static void main(String[] args) {

        System.out.print("Enter menu number - ");
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
        Menu menu = Menu.getMenu(i);

        switch (menu) {

            case ADD: {
                System.out.println("ADD");
                break;
            }
            case REMOVE: {
                System.out.println("REMOVE");
                break;
            }
            case EXIT: {
                System.out.println("Bye");
            }
        }

    }



}

enum Menu {

    ADD,
    REMOVE,
    EXIT;


    public static Menu getMenu(int i) {
        for(Menu m : Menu.values()) {
            if(i == m.ordinal() + 1) {
                return m;
            }
        }
        return EXIT;
    }

}
