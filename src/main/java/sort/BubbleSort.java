package sort;

import java.util.Arrays;

/**
 * @Author: panyusheng
 * @Date: 2021/5/27
 * @Version 1.0
 * <p>
 * 冒泡排序
 */
public class BubbleSort {
    public static void main(String[] args) {
        int arr[] = {3, 9, -1, 10, 20};
        System.out.println(Arrays.toString(arr));
        System.out.println("----------------------------");

        int temp;
        int count = 0;
        boolean flag = false;
        // 进行 n - 1 趟，每趟比较次数 - 1
        for (int i = 0; i < arr.length - 1; i++) {
            count++;
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (!flag) {
                break;
            } else {
                flag = false;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("趟数：" + count);
    }
}
