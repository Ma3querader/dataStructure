package sort;

import java.util.Arrays;

/**
 * @Author: panyusheng
 * @Date: 2021/6/2
 * @Version 1.0
 * <p>
 * 快排
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {-9, 78, 0, 23, -567, 70, -1, 900, 4561};
//        int[] arr = {3, 1, 2};
        System.out.println(Arrays.toString(arr));
        qk(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));


    }

    public static void qk(int[] arr, int left, int right) {
        int pivot = arr[(left + right) / 2];
        int temp = 0;
        int l = left;
        int r = right;
        while (l < r) {
            while (arr[l] < pivot) {
                l += 1;
            }
            while (arr[r] > pivot) {
                r -= 1;
            }
            if (l >= r) {
                break;
            }
            temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;

        }
        if (l == r) {
            l += 1;
            r -= 1;
        }
        if (left < r) {
            qk(arr, left, r);
        }
        if (right > l) {
            qk(arr, l, right);
        }
    }

}
