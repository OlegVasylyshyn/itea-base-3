package week5.day1;

import week3.day2.zoo.Cat;

public class ObjectTest {

    public static void main(String[] args) {

        print(5);
        print('a');
        print(true);
        print("Hello world");
        print(new Cat());

    }

    // JNI
    private static void print(Object o) {
        System.out.println(o);
    }

}
