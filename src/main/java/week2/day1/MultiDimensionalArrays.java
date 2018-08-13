package week2.day1;

public class MultiDimensionalArrays {

    public static void main(String[] args) {

        int[][][] mtx = new int[10][10][10];

        for (int i = 0; i < mtx.length; i++) {
            for (int j = 0; j < mtx[i].length; j++) {
                for (int k = 0; k < mtx[i][j].length; k++) {
                    System.out.println(mtx[i][j][k]);
                }
                System.out.println();
            }
        }


    }

}
