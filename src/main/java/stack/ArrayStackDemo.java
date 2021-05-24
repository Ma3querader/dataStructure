package stack;

/**
 * @Author: panyusheng
 * @Date: 2021/5/24
 * @Version 1.0
 */
public class ArrayStackDemo {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        System.out.println(stack.isEmpty());
        System.out.println("-----------");
        stack.push(2);
        stack.push(3);
        stack.push(5);
        stack.push(8);
        stack.push(10);
        System.out.println(stack.isFull());
        System.out.println("-----------");
        stack.list();
        System.out.println("-----------");
        stack.pop();
        System.out.println(stack.isFull());
        stack.list();
    }
}
