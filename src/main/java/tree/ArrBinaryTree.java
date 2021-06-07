package tree;

/**
 * @Author: panyusheng
 * @Date: 2021/6/7
 * @Version 1.0
 */
public class ArrBinaryTree {

    private int[] arr;

    public ArrBinaryTree(int[] arr) {
        this.arr = arr;
    }

    public void preOrder() {
        this.preOrder(0);
    }

    public void preOrder(int index) {
        if(arr == null || arr.length == 0) {
            System.out.println("数组为空");
            return;
        }
        System.out.println(arr[index]);
        if ((index * 2 + 1) < arr.length) {
            preOrder((index * 2 + 1));
        }
        if((index * 2 + 2) < arr.length) {
            preOrder((index * 2 + 2));
        }
    }

}
