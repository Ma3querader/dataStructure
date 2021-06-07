package tree;

/**
 * @Author: panyusheng
 * @Date: 2021/6/7
 * @Version 1.0
 * <p>
 * 顺序二叉树
 */
public class ArrBinaryTreeDemo {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        ArrBinaryTree tree = new ArrBinaryTree(arr);
        tree.preOrder();
    }
}
