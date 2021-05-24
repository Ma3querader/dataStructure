package stack;

/**
 * @Author: panyusheng
 * @Date: 2021/5/24
 * @Version 1.0
 * <p>
 * 栈 FILO
 */
public class ArrayStack {
    private int maxSize;
    private int[] stack;
    private int top = -1;   // 栈顶

    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[maxSize];
    }

    public boolean isFull() {
        return this.top == maxSize - 1;
    }

    public boolean isEmpty() {
        return this.top == -1;
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        int value = this.stack[this.top];
        top--;
        return value;
    }

    // 从栈顶开始遍历
    public void list() {
        if (isEmpty()) {
            throw new RuntimeException("栈为空");
        }
        for (int i = top; i > -1; i--) {
            System.out.println(this.stack[i]);
        }
    }


}
