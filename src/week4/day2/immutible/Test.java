package week4.day2.immutible;

public class Test {

    public static void main(String[] args) {

        User dex = new User("Dex", 20);
        User james = dex.setName("James");

        System.out.println(dex);
        System.out.println(james);

    }

}
