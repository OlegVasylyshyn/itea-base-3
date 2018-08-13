package week4.day2.string;

import java.util.Scanner;

public class StringTest {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        String s = "";
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
//            s += scanner.nextLine();
            sb.append(scanner.nextLine());
        }

        s = sb.toString();
        System.out.println(s);

    }

}
