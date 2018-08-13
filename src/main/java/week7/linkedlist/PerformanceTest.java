package week7.linkedlist;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PerformanceTest {

    public static void main(String[] args) throws IOException {

        List<Integer> al = new ArrayList<>();
        List<Integer> ll = new LinkedList<>();

        int ii = 0;
        long startTime = System.currentTimeMillis();
        while (ii++ < 1_000_000_000) {}
        long endTime = System.currentTimeMillis();
        System.out.println("Empty cycle - " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            al.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("AL init time - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            ll.add(i);
        }
        endTime = System.currentTimeMillis();
        System.out.println("LL init time - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        al.remove(5_000_000);
        endTime = System.currentTimeMillis();
        System.out.println("AL remove from center - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        ll.remove(5_000_000);
        endTime = System.currentTimeMillis();
        System.out.println("AL remove from center - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        al.remove(0);
        endTime = System.currentTimeMillis();
        System.out.println("AL remove from begin - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        ll.remove(0);
        endTime = System.currentTimeMillis();
        System.out.println("AL remove from begin - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        al.add(5_000_000, 30);
        endTime = System.currentTimeMillis();
        System.out.println("AL inset center - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        ll.add(5_000_000, 30);
        endTime = System.currentTimeMillis();
        System.out.println("LL inset center - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        al.add(30);
        endTime = System.currentTimeMillis();
        System.out.println("AL add - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        ll.add(30);
        endTime = System.currentTimeMillis();
        System.out.println("LL add - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        al.add(0, 10);
        endTime = System.currentTimeMillis();
        System.out.println("AL prepend - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        ll.add(0, 10);
        endTime = System.currentTimeMillis();
        System.out.println("LL prepend - " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        al.get(2_500_000);
        endTime = System.currentTimeMillis();
        System.out.println("AL get from center - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        ll.get(2_500_000);
        endTime = System.currentTimeMillis();
        System.out.println("LL get from center - " + (endTime - startTime));



        startTime = System.currentTimeMillis();
        for(int i : al){
        }
        endTime = System.currentTimeMillis();
        System.out.println("AL iteration - " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        for(int i : ll){
        }
        endTime = System.currentTimeMillis();
        System.out.println("LL iteration - " + (endTime - startTime));

    }

}
