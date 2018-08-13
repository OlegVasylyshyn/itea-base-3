package week2.day1;

import java.util.Arrays;

public class ArrayCopy {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.println("Source - " + Arrays.toString(arr));

        int[] arrCopy1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrCopy1[i] = arr[i];
        }
        System.out.println("Copy1 - " + Arrays.toString(arrCopy1));

        int[] arrCopy2 = arr.clone();
        System.out.println("Copy2 - " + Arrays.toString(arrCopy2));

        int[] arrCopy3 = new int[4];
        System.arraycopy(arr, 1, arrCopy3, 1, 3);

        System.out.println("Copy3 - " + Arrays.toString(arrCopy3));


        int[] arrCopy4 = Arrays.copyOf(arr, 3);
        System.out.println("Copy4 - " + Arrays.toString(arrCopy4));

    }


}
