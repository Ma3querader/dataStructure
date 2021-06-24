package test;

/**
 * @Author: panyusheng
 * @Date: 2021/6/21
 * @Version 1.0
 */
public class Test2 {
    public void t() {
        System.out.println("父类的t");
    }
}

class H extends Test2 {
    public static void main(String[] args) {
        Test2 t2 = new H();
        t2.t();
    }

    @Override
    public void t() {
        System.out.println("子类的t");
    }

    public void s() {
        System.out.println("子类的s");
    }
}
