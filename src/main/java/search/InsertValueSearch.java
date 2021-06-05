package search;

/**
 * @Author: panyusheng
 * @Date: 2021/6/5
 * @Version 1.0
 * <p>
 * 插值排序
 */
public class InsertValueSearch {
    public static void main(String[] args) {
        int arr[] = {1, 8, 10, 89, 1000, 1000, 1234};
        int index = insertValueSearch(arr, 0, arr.length - 1, 89);
        System.out.println(index);

    }

    private static int insertValueSearch(int[] arr, int left, int right, int target) {
        if (left > right || target < arr[0] || target > arr[arr.length - 1]) {
            return -1;
        }
        int mid = left + (right - left) * (target - arr[left]) / (arr[right] - arr[left]);
        int midValue = arr[mid];
        if (target > midValue) {
            return insertValueSearch(arr, mid + 1, right, target);
        } else if (target < midValue) {
            return insertValueSearch(arr, left, mid - 1, target);
        } else {
            return mid;
        }
    }
}
