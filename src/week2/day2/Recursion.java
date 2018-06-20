package week2.day2;

public class Recursion {

    public static void main(String[] args) {

        // StackOverflowError
        r();

    }

    private static void r(){
        System.out.println("Work");
        r();
        System.out.println("End");
    }

}
