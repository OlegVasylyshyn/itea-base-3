package week2.day1;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }

        System.out.println(Arrays.toString(arr));


        int steps = 0;
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length - 1; j++) {
                steps++;
                if(arr[min] > arr[j + 1]) {
                    min = j + 1;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }

        System.out.println(Arrays.toString(arr));
        System.out.println("Steps - " + steps);


    }

}
