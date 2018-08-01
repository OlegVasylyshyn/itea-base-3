package week8.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapTest {

    public static void main(String[] args) {

        Map<Hash, Integer> map = new HashMap<>();

        map.put(new Hash(10), 10);
        System.out.println(map.get(new Hash(10)));

    }

}

final class Hash {

    final int hash;

    public Hash(int hash) {
        this.hash = hash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hash)) return false;
        Hash hash1 = (Hash) o;
        return hash == hash1.hash;
    }

    @Override
    public int hashCode() {
        return Objects.hash(hash);
    }
}