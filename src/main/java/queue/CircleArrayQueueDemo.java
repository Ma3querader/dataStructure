package queue;

/**
 * @Author: panyusheng
 * @Date: 2021/5/21
 * @Version 1.0
 */
public class CircleArrayQueueDemo {
    public static void main(String[] args) {
        CircleArrayQueue queue = new CircleArrayQueue(3);
        queue.addQueue(123);
        queue.addQueue(333);
        queue.addQueue(444);
        queue.showQueue();
        System.out.println("----------");
        System.out.println(queue.getQueue()); // front = 1
        System.out.println("----------");
        queue.addQueue(555);
        System.out.println(queue.getQueue());
        System.out.println(queue.getQueue());
        queue.addQueue(666);
        System.out.println(queue.getQueue());
    }
}
