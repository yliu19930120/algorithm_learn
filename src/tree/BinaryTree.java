package tree;

/**
 * 二叉查找树
 * @param <K>
 * @param <V>
 */
public class BinaryTree<K extends Comparable<K>,V> {

    private Node<K,V> root;
    public V get(K key){
        return get(root,key);
    }

    public V get(Node node,K key){
        if(node==null){
            return null;
        }
        int cmp = key.compareTo((K) node.key);
        if(cmp>0){
            return get((Node) node.right,key);
        }else if(cmp < 0){
            return get((Node) node.left,key);
        }else {
            return (V) node.value;
        }
    }

    public void put(K key,V value){
        root = put(root,key,value);
    }

    public Node put(Node node,K key,V value){
        if(node == null){
            return new Node(key,value,1);
        }
        int cmp = key.compareTo((K) node.key);
        if(cmp > 0){
            node.right = put(node.right,key,value);
        }else if(cmp < 0){
            node.left = put(node.left,key,value);
        }else {
            node.value = value;
        }
        node.N = size(node.left) + size(node.right) + 1;
        return node;
    }

    public int size(){
        return size(root);
    }

    public int size(Node node){
        if(node == null){
            return 0;
        }else {
            return node.N;
        }
    }
    private class Node<K extends Comparable<K>,V> {
        Node<K,V> left;
        Node<K,V> right;
        K key;
        V value;
        int N;


        public Node(K key, V value, int n) {
            this.key = key;
            this.value = value;
            N = n;
        }
    }
}
