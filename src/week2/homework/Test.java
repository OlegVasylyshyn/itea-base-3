package week2.homework;

import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 50; i++) {
            ArrayWrapper.add(i);
        }

        System.out.println(Arrays.toString(ArrayWrapper.getArr()));

    }

}
