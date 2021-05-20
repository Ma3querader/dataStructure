package queue;

/**
 * @Author: panyusheng
 * @Date: 2021/5/20
 * @Version 1.0
 */
public class ArrayQueue {

    private int maxSize; // 表示数组的最大容量
    private int front; // 队列头
    private int rear; // 队列尾
    private int[] arr; // 该数组用于存放数据, 模拟队列

    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        this.arr = new int[maxSize];
        this.front = -1; // 指向队列头部，分析出 front 是指向队列头的前一个位置.
        this.rear = -1;  // 指向队列尾，指向队列尾的数据(即就是队列最后一个数据)
    }

    public boolean isFull() {
        return this.rear == maxSize - 1;
    }

    public boolean isEmpty() {
        return this.rear == this.front;
    }

    public void addQueue(int i) {
        if (isFull()) {
            System.out.println("队列已满");
            return;
        }
        rear++;
        this.arr[rear] = i;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空...");
        }
        this.front++;
        return this.arr[front];
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列为空...");
            return;
        }
        for (int i = 0; i < this.arr.length; i++) {
            System.out.println("arr[" + i + "]" + " = " + this.arr[i]);
        }
    }

    public int headQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列为空...");
        }
        return this.arr[front + 1];
    }

}
