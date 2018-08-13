package week8.map;

public class MyHashTableTest {

    public static void main(String[] args) {

        MyHashTable<String, Integer> table = new MyHashTable<>();
        for (int i = 0; i < 100; i++) {
            table.put("" + i, i);
            table.put("" + i, i);
        }

        System.out.println(table);
        System.out.println("Size - " + table.getSize());


        System.out.println(table.get("50"));
        System.out.println(table.get("75"));

    }

}
