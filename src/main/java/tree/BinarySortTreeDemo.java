package tree;

/**
 * @Author: panyusheng
 * @Date: 2021/6/8
 * @Version 1.0
 * <p>
 * 二叉排序树
 */
public class BinarySortTreeDemo {
    public static void main(String[] args) {
        int[] arr = {7, 3, 10, 12, 5, 1, 9};
        BinarySortTree tree = new BinarySortTree();
        for (int i = 0; i < arr.length; i++) {
            tree.add(new Node2(arr[i]));
        }
        tree.infixOrder();


    }
}
