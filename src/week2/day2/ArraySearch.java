package week2.day2;

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {

        final int arr[] = new int[1000];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        int search = 555;
        int steps = 0;
        boolean wasFound = false;

        // lineal
        for (int i = 0; i < arr.length; i++) {
            steps++;
            if(search == arr[i]) {
                wasFound = true;
                break;
            }
        }

        System.out.println("Was found - " + wasFound);
        System.out.println("Steps - " + steps);
        wasFound = false;
        steps = 0;


        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));

        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            steps++;
            int mid = (end + start) >>> 1;
            if(arr[mid] == search){
                wasFound = true;
                break;
            } else if(search > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Was found - " + wasFound);
        System.out.println("Steps - " + steps);

    }

}
