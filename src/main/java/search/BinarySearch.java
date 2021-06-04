package search;


/**
 * @Author: panyusheng
 * @Date: 2021/6/4
 * @Version 1.0
 *
 * 二分查找
 */
public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = { 1, 8, 10, 89,1000,1000, 1234 };
        int resIndex = binarySearch1(arr, 0, arr.length - 1, 1000);
        System.out.println(resIndex);
    }

    private static int binarySearch1(int[] arr, int left, int right, int target) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (target > midVal) {
            return binarySearch1(arr, mid + 1, right, target);
        } else if (target < midVal) {
            return binarySearch1(arr, left, mid - 1, target);
        } else {
            return mid;
        }
    }



}
