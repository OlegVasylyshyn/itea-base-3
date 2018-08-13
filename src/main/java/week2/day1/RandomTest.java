package week2.day1;

import java.util.Arrays;

public class RandomTest {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(args));

    }

}
