package recursive;

/**
 * @Author: panyusheng
 * @Date: 2021/5/25
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        test(4);
        int i = test2(4);
        System.out.println(i);
    }

    public static void test(int n) {
        if (n > 2) {
            test(n - 1);
        }
        System.out.println("n=" + n);
    }

    public static int test2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return test2(n - 1) * n;
        }
    }
}
