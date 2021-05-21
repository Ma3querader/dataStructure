package queue;


/**
 * @Author: panyusheng
 * @Date: 2021/5/20
 * @Version 1.0
 */
public class ArrayQueueDemo {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.addQueue(1);
        queue.addQueue(22);
        queue.addQueue(5445);
        queue.showQueue();
        System.out.println("---------");
        System.out.println(queue.getQueue());
        System.out.println(queue.getQueue());
        System.out.println("---------");
        queue.showQueue();
    }
}
