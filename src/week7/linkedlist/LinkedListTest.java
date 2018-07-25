package week7.linkedlist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            list.add("" + i);
        }

        List<String> list2 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list2.add("" + i);
        }

        System.out.println(list);
        System.out.println(list.equals(list2));

    }

}
