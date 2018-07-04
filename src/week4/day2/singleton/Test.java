package week4.day2.singleton;

public class Test {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        School instance = School.getInstance();
        long endTime = System.nanoTime();
        System.out.println("First get instance - " + (endTime - startTime));


        startTime = System.nanoTime();
        School.getInstance();
        endTime = System.nanoTime();
        System.out.println("Second get instance - " + (endTime - startTime));

    }

}
