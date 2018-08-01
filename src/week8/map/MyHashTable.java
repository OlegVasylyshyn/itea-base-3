package week8.map;

public class MyHashTable<K, V> {

    @SuppressWarnings("unchecked")
    private Node<K, V>[] table = new Node[20];
    private float overloadFactor = 0.75f;
    private int size;

    public V put(K key, V value){
        int tableLength = table.length;
        if(((double)size / tableLength) > overloadFactor) {
            System.out.println("REHASH !!!");
            reHash();
            tableLength = table.length;
            System.out.println("NEW LENGTH - " + tableLength);
        }

        return putVal(table, key, value, tableLength);
    }

    private V putVal(Node<K, V>[] table, K key, V value, int tableLength) {
        int index = key.hashCode() % tableLength;
        if(table[index] == null) {
            table[index] = new Node<>(key, value);
            size++;
            return null;
        }
        Node<K, V> kvNode = table[index];
        if(kvNode.key.equals(key)){
            return replaceValue(value, kvNode);
        }

        return replaceValue(value, kvNode);
    }

    private void reHash(){
        @SuppressWarnings("unchecked")
        Node<K, V>[] nodes = new Node[table.length << 1];

        size = 0;
        for (Node<K, V> n : table) {
            if(n != null) {
                putVal(nodes, n.key, n.value, nodes.length);
            }
        }

        table = nodes;
    }

    public V get(K key) {
        int index = key.hashCode() % table.length;
        Node<K, V> kvNode = table[index];
        return kvNode == null ? null : kvNode.value;
    }

    public int getSize() {
        return size;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder("[");

        int s = 0;
        for (Node<K, V> node: table) {
            if(node != null) {
                s++;
                sb
                        .append(node.key)
                        .append(" -> ")
                        .append(node.value)
                        .append(", ");
            }
        }

        return sb.append(" size - ").append(s).append("]").toString();
    }

    private V replaceValue(V value, Node<K, V> kvNode) {
        V toReturn = kvNode.value;
        kvNode.value = value;
        return toReturn;
    }


    private static class Node<K, V> {

        K key;
        V value;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

}
