package week8.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest {

    // If Tree
    // O(log2n)

    // If Hash
    // O(1)

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        System.out.println(set.add("Hello"));
        System.out.println(set.add("World"));
        System.out.println(set.add("Hello"));

        System.out.println(set.contains("Hello"));


        set.forEach(System.out::println);

        set.stream()
                .filter(e -> e.startsWith("H"))
                .map(String::toLowerCase)
                .forEach(System.out::println);


        Set<Integer> set1 = new TreeSet<>();
        Set<Integer> set2 = new HashSet<>();

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            set2.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("HashSet time - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            set1.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("TreeSet time - " + (endTime - startTime));




        startTime = System.nanoTime();
        set1.contains(1);
        endTime = System.nanoTime();
        System.out.println("TreeSet search time - " + (endTime - startTime));

        startTime = System.nanoTime();
        set2.contains(1);
        endTime = System.nanoTime();
        System.out.println("HashSet search time - " + (endTime - startTime));


        System.out.println(set1);
        System.out.println(set2);

    }




}
