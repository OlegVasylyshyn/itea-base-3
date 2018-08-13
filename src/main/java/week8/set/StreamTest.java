package week8.set;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class StreamTest {

    public static void main(String[] args) {

        List<Integer> al = new ArrayList<>(10_000_000);
        for (int i = 0; i < 10_000_000; i++) {
            al.add(i);
        }

        long startTime;
        long endTime;


        startTime = System.currentTimeMillis();
        Stream<Integer> newStream = al.stream().filter(e -> e % 2 == 0).map(e -> ++e);
        endTime = System.currentTimeMillis();
        System.out.println("Stream time - " + (endTime - startTime));
        System.out.println("Result size - " + newStream.count());

        List<Integer> result = new ArrayList<>(5_000_001);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < al.size(); i++) {
            if(al.get(i) % 2 == 0) {
                result.add(al.get(i) + 1);
            }
        }
        endTime = System.currentTimeMillis();
        System.out.println("AL time - " + (endTime - startTime));
        System.out.println("Result size - " + result.size());
        System.out.println();

    }

}
