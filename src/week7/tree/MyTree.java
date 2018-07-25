package week7.tree;

public class MyTree<K, V> {

    private TreeNode<K, V> root;
    private int size;


    public V put(K key, V value) {
        if(size == 0) {
            TreeNode<K, V> node = new TreeNode<>(key, value, null, null, null);
            root = node;
            size++;
            return null;
        }

        return putValue(root, key, value);
    }

    private V putValue(TreeNode<K, V> currentRoot, K key, V value) {
        // TODO: 7/25/18 implement
        return null;
    }

    private static class TreeNode<K, V> {

        K key;
        V value;

        TreeNode<K, V> root;
        TreeNode<K, V> right;
        TreeNode<K, V> left;

        public TreeNode(K key, V value, TreeNode<K, V> root, TreeNode<K, V> right, TreeNode<K, V> left) {
            this.key = key;
            this.value = value;
            this.root = root;
            this.right = right;
            this.left = left;
        }
    }

}
