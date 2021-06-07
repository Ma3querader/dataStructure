package tree;

import java.util.Arrays;

/**
 * @Author: panyusheng
 * @Date: 2021/6/7
 * @Version 1.0
 * <p>
 * 堆排序
 */
public class HeapSort {
    public static void main(String[] args) {
        int arr[] = {4, 6, 8, 5, 9};
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            adjustHeap(arr, i, arr.length);
        }
        System.out.println("初始化大顶堆：" + Arrays.toString(arr));
        int temp;
        for (int j = arr.length - 1; j > 0; j--) {
            temp = arr[j];
            arr[j] = arr[0];
            arr[0] = temp;
            adjustHeap(arr, 0, j);
        }
        System.out.println(Arrays.toString(arr));


    }


    /**
     * 功能： 将一个数组(二叉树), 调整成一个大顶堆
     * 将 以 i 对应的非叶子结点的树调整成大顶堆
     * 举例 int arr[] = {4, 6, 8, 5, 9}; => i = 1 => adjustHeap => 得到 {4, 9, 8, 5, 6}
     * 如果我们再次调用 adjustHeap 传入的是 i = 0 => 得到 {4, 9, 8, 5, 6} => {9,6,8,5, 4}
     *
     * @param arr    待调整的数
     * @param i      表示非叶子结点在数组中索引
     * @param lenght 表示对多少个元素继续调整， length 是在逐渐的减少
     */
    public static void adjustHeap(int arr[], int i, int lenght) {
        int temp = arr[i];
        for (int k = i * 2 + 1; k < lenght; k = k * 2 + 1) { // k是i的左子节点
            if (k + 1 < lenght && arr[k] < arr[k + 1]) { // 左<右
                k++;    // k指向右子节点
            }
            if (arr[k] > temp) {
                arr[i] = arr[k];
                i = k;
            } else {
                break;
            }
        }
        arr[i] = temp;
    }


}
