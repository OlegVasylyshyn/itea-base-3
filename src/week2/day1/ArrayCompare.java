package week2.day1;

import java.util.Arrays;

public class ArrayCompare {

    public static void main(String[] args) {

        int[] arr1 = new int[5];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 100);
//            arr1[i] = i;
        }

        int[] arr2 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (int) (Math.random() * 100);
//            arr2[i] = i;
        }

        if(arr1.length != arr2.length) {
            System.out.println("not equal");
            return;
        }

        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]) {
                System.out.println("not equal");
                return;
            }
        }

        System.out.println("equal");


        System.out.println(Arrays.equals(arr1, arr2));


    }

}
