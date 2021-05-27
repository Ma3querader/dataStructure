package recursive;

/**
 * @Author: panyusheng
 * @Date: 2021/5/27
 * @Version 1.0
 * <p>
 * 八皇后
 */
public class Queen8 {
    int max = 8;
    int[] array = new int[max];
    static int count = 0;
    static int judgeCount = 0;

    public static void main(String[] args) {
        Queen8 queen8 = new Queen8();
        queen8.check(0);
        System.out.println(count);
        System.out.println(judgeCount);
    }

    private void check(int n) {
        if (n == max) {
            print();
            return;
        }
        for (int i = 0; i < max; i++) {
            // 放在i列
            array[n] = i;
            // 判断是否冲突
            if (judge(n)) {
                check(n + 1);
            }
        }
    }

    private boolean judge(int n) {
        judgeCount++;
        for (int i = 0; i < n; i++) {// 行
            // 判断和前面的皇后是否同一列、同一斜线
            // 同一行不同判断，n会+1
            if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
                return false;
            }
        }
        return true;
    }

    private void print() {
        count++;
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


}
