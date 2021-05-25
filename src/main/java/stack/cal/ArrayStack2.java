package stack.cal;

/**
 * @Author: panyusheng
 * @Date: 2021/5/25
 * @Version 1.0
 */
public class ArrayStack2 {

    private int maxSize;
    private int[] stack;
    private int top = -1;

    public ArrayStack2(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    // 返回栈顶
    public int peek() {
        return stack[top];
    }

    public boolean isFull() {
        return top == maxSize - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int value) {
        if(isFull()) {
            System.out.println("栈满");
            return;
        }
        top++;
        stack[top] = value;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("栈空，没有数据");
        }
        int value = stack[top];
        top--;
        return value;
    }

    public void list() {
        if(isEmpty()) {
            System.out.println("栈空，没有数据");
            return;
        }
        //从栈顶开始显示数据
        for(int i = top; i > -1 ; i--) {
            System.out.println(this.stack[i]);
        }
    }

    /**
     * 返回操作符优先级，数字越大优先级越高
     * @param operator 操作符
     * @return
     */
    public int priority(int operator) {
        if (operator == '*' || operator == '/') {
            return 1;
        } else if (operator == '+' || operator == '-') {
            return 0;
        } else {
            return -1;
        }
    }

    // 判断是不是一个操作符
    public boolean isOper(char val) {
        return val == '+' || val == '-' || val == '*' || val == '/';
    }

    /**
     * 数学运算
     * @param num1 操作数1
     * @param num2 操作数2
     * @param oper 操作符
     * @return
     */
    public int cal(int num1, int num2, int oper) {
        int res = 0;
        switch (oper) {
            case '+':
                res = num1 + num2;
                break;
            case '-':
                res = num2 - num1;
                break;
            case '*':
                res = num1 * num2;
                break;
            case '/':
                res = num2 / num1;
                break;
            default:
                break;
        }
        return res;
    }
}
