package tree;

import utils.TimeUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree<Integer,String> binaryTree = new BinaryTree();
        int max = 100*100;
        IntStream.range(0,max).forEach(i->{
            binaryTree.put(i,String.valueOf(i));
        });
        long start = System.currentTimeMillis();
        String s = binaryTree.get(9999);
        TimeUtils.printTimes("二叉堆查找:",start);

        List<String> collect = IntStream.range(0, max).mapToObj(String::valueOf).collect(Collectors.toList());
        start = System.currentTimeMillis();
        String s1 = collect.stream().filter(t -> "9999".equals(t)).findFirst().get();
        TimeUtils.printTimes("顺序查找:",start);
        System.out.println(s);
        System.out.println(s1);
    }

    public static void sequentialSearch(){

    }
}
