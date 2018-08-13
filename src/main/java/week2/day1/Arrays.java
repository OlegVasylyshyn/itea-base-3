package week2.day1;

public class Arrays {

    public static void main(String[] args) {

        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println();
//        double[] points = new double[]{0.1, 3.3, 5.3};
        double[] points = {0.1, 3.3, 5.3};
        for (int i = 0; i < points.length; i++) {
            System.out.println(points[i]);
        }

        // ArrayIndexOutOfBoundsException
        arr[100] = 10;

    }


}
