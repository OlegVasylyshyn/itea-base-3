package week7.tree;

public class TestMyTree {

    public static void main(String[] args) {

        MyTree<Integer, String> tree = new MyTree<>();

        tree.put(10, "10");
        tree.put(5, "5");
        tree.put(15, "15");
        tree.put(7, "7");
        tree.put(12, "12");
        tree.put(3, "3");


        System.out.println(tree);

    }

}
