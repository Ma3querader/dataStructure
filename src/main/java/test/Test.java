package test;

/**
 * @Author: panyusheng
 * @Date: 2021/6/21
 * @Version 1.0
 */
public class Test {

    public Test() {
        System.out.println(1111);
    }

    {
        System.out.println(555);
    }
    static {
        System.out.println(666);
    }

    public static void main(String[] args) {
        B b = new B();
    }

}

class B extends Test {
    private int nu;
    public B() {
        System.out.println(2222);
        this.nu = 10;
    }
    {
        System.out.println(333);
    }
    static {
        System.out.println(4444);
    }
}