package week5.day1.inner;

import java.util.Scanner;

public class OuterTest {

    public static void main(String[] args) {

        Outer outer = new Outer();
        outer = null;

        Outer.Inner[] inner = getInner();
        inner = null;
        System.gc();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

    }

    private static Outer.Inner[] getInner(){
        Outer outer = new Outer();
        Outer.Inner[] inner = new Outer.Inner[200];

        for (int i = 0; i < inner.length; i++) {
            inner[i] = outer.getInner();
        }

        outer = null;
        return inner;
    }

}
