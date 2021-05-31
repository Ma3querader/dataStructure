package sort;

import java.util.Arrays;

/**
 * @Author: panyusheng
 * @Date: 2021/5/31
 * @Version 1.0
 *
 * 插入排序
 */
public class InsertSort {
    public static void main(String[] args) {
        int[] arr = {101, 34, 119, 1, -1, 89};
        System.out.println(Arrays.toString(arr));

        int insertVal = 0;
        int insertIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            //定义待插入的数
            insertVal = arr[i];
            insertIndex = i - 1;
            // 给 insertVal 找到插入的位置
            while(insertIndex >=0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex]; // 后移
                insertIndex--;
            }
            if(insertIndex + 1 != i) {
                arr[insertIndex + 1] = insertVal;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
