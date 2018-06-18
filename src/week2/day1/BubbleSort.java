package week2.day1;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));

        int steps = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - (i + 1); j++) {
                steps++;
                if(arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Steps - " + steps);

    }

}
