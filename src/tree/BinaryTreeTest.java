package tree;

import java.util.stream.IntStream;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree<Integer,String> binaryTree = new BinaryTree();
        int max = 100*100;
        IntStream.range(0,max).forEach(i->{
            binaryTree.put(i,String.valueOf(i));
        });

        String s = binaryTree.get(50*100);
        System.out.println(s);
    }

    public static void sequentialSearch(){

    }
}
