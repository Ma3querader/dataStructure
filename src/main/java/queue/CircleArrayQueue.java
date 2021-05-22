package queue;

/**
 * @Author: panyusheng
 * @Date: 2021/5/21
 * @Version 1.0
 *
 * 环形队列
 */
public class CircleArrayQueue {

    private int maxSize; // 表示数组的最大容量
    private int front; // 队列头，指向第一个元素
    private int rear; // 队列尾，指向队列的最后一个元素，实际操作中用于指向最后一个元素的后一位
    private int[] arr; // 该数组用于存放数据, 模拟队列

    public CircleArrayQueue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
    }

    public boolean isFull() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isEmpty() {
        return rear == front;
    }

    public void addQueue(int n) {
        // 判断队列是否满
        if (isFull()) {
            System.out.println("队列满，不能加入数据~");
            return;
        }
        // 直接将数据加入
        arr[rear] = n;
        // 将 rear 后移, 这里必须考虑取模
        rear = (rear + 1) % maxSize;
    }

    public int getQueue() {
        if (isEmpty()) {
            throw new RuntimeException("队列空，不能取数据");
        }
        int value = arr[front];
        front = (front + 1) % maxSize;
        return value;
    }

    public void showQueue() {
        if (isEmpty()) {
            System.out.println("队列空的，没有数据~~");
            return;
        }
        for (int i = front; i < size(); i++) {
            System.out.println("arr[" + i + "]" + " = " + this.arr[i]);
        }
    }

    public int size() {
        return (rear + maxSize - front) % maxSize;
    }

}

