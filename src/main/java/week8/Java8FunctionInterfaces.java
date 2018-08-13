package week8;

import java.util.function.*;

public class Java8FunctionInterfaces {

    public static void main(String[] args) {

        // void -> void
        Runnable runnable = () -> {};
        Runnable runnable2 = Java8FunctionInterfaces::run;
        Runnable runnable3 = System::gc;

        // void -> T
        Supplier<String> supplier1 = () -> "";
        Supplier<String> supplier2 = Java8FunctionInterfaces::supply;
        Supplier<Double> supplier3 = Math::random;

        // T -> void
        Consumer<String> consumer1 = (s) -> {};
        Consumer<String> consumer2 = Java8FunctionInterfaces::consume;
        Consumer<String> consumer3 = System.out::println;

        // T -> T
        Function<String, Integer> f1 = (s) -> s.length() + 10;
        Function<String, Integer> f2 = Java8FunctionInterfaces::f;
        Function<Float, Integer> f3 = Math::round;

        // (T, T) -> T
        BiFunction<String, String, Integer> biFunction = (s1, s2) -> (s1 + s2).length();

        // Predicate T -> boolean
        Predicate<String> predicate = (s) -> s.startsWith("O");

    }

    private static void run(){
    }

    private static String supply(){
        return "";
    }

    private static void consume(String s) {
    }

    private static int f(String s) {
        return s.trim().length();
    }

}
