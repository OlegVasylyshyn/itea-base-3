package week7;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Test {

    public static void main(String[] args) {

        List<Integer> ints = new ArrayList<>(50);
        ints.add(1);
        ints.add(2);
        ints.add(3);

        ListIterator<Integer> iterator = ints.listIterator();

        for (int num: ints) {
            System.out.println(num);
//            ints.remove(num);
        }

        System.out.println(ints);


        for (int i = 0; i < ints.size(); i++) {
            System.out.println(ints.get(i));
            if(ints.get(i) % 2 == 0) {
                ints.remove(i);
            }
        }

        System.out.println(ints);


        // JAVA 8
        System.out.println("Java 8");
        System.out.println("Foreach");
        ints.forEach(System.out::println);
        System.out.println("Remove everything which bigger than 2");
        ints.removeIf(num -> num > 2);
        ints.forEach(System.out::println);

        ints.add(1);
        ints.add(2);
        ints.add(3);
        ints.add(4);
        ints.add(5);

        Integer integer = ints.stream().filter(num -> num % 2 == 0).reduce((e1, e2) -> e1 + e2).get();
        System.out.println(integer);
        System.out.println(ints);

        List<String> intsString = ints.stream().map(i -> "" + i).collect(toList());
        System.out.println(intsString);



        // Flatmap
        System.out.println("Flatmap test");
        List<List<String>> lists = new ArrayList<>();
        ArrayList<String> l1 = new ArrayList<>();
        l1.add("a");
        l1.add("b");
        ArrayList<String> l2 = new ArrayList<>();
        l2.add("f");
        l2.add("c");
        ArrayList<String> l3 = new ArrayList<>();
        l3.add("z");
        l3.add("x");
        lists.add(l1);
        lists.add(l2);
        lists.add(l3);

        System.out.println(lists);
        List<String> strings = lists.stream().flatMap(Collection::stream).collect(toList());
        System.out.println(strings);
        List<List<String>> collect = strings.stream().map(Arrays::asList).collect(toList());
        System.out.println(collect);


    }

}
