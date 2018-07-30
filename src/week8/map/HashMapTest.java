package week8.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

    public static void main(String[] args) {

        Map<Hash, Integer> map = new HashMap<>();

        // works fine
        Hash key = new Hash(10);
        map.put(key, 10);
        map.put(new Hash(15), 15);
        System.out.println(map.get(key));

        // works bad
        System.out.println(map.get(new Hash(10)));

    }

}

class Hash {

    int hash;

    public Hash(int hash) {
        this.hash = hash;
    }

}