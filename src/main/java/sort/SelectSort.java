package sort;

import java.util.Arrays;

/**
 * @Author: panyusheng
 * @Date: 2021/5/27
 * @Version 1.0
 */
public class SelectSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1};
        System.out.println(Arrays.toString(arr));

        // 进行 n - 1 趟，每趟比较次数 - 1
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            int min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            if (minIndex != i) {    // 交换了
                arr[minIndex] = arr[i];
                arr[i] = min;
            }
        }
        System.out.println("---------------------");
        System.out.println(Arrays.toString(arr));
    }
}
