package week3.day2.java8;

public class Test {

    public static void main(String[] args) {

        Implementation impl = new Implementation();
        System.out.println(impl.n);
        impl.m();
        impl.work();


        // Lambda
        Java8Interface impl2 = () -> System.out.println("HELLO WORLD");

    }

}
