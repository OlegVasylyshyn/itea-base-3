package week2.day1;

import java.util.Arrays;

public class ReferenceTest {

    public static void main(String[] args) {

        String hello = "Hello world";
        String world = new String("Hello");

        System.out.println(hello == world);
        System.out.println(hello.equals(world));

        String lowerCase = hello.toLowerCase();
        System.out.println(lowerCase);
        System.out.println(hello);

        System.out.println("Starts with - " + hello.startsWith("H"));

        System.out.println(hello.replace("world", "Dex"));

        String substring = hello.substring(6);
        System.out.println(substring);

        System.out.println(hello.trim());

        String[] words = hello.split(" ");
        System.out.println(Arrays.toString(words));

    }

}
