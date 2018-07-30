package week8.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    // O(log2n)

    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        System.out.println(set.add("Hello"));
        System.out.println(set.add("World"));
        System.out.println(set.add("Hello"));

        System.out.println(set.contains("Hello"));


        set.forEach(System.out::println);

        set.stream()
                .filter(e -> e.startsWith("H"))
                .map(String::toLowerCase)
                .forEach(System.out::println);


    }




}
