package linked.dou;

/**
 * @Author: panyusheng
 * @Date: 2021/5/23
 * @Version 1.0
 */
public class DoubleLinkedListDemo {
    public static void main(String[] args) {
        DoubleLinkedList list = new DoubleLinkedList();
        list.addNode(new HeroNode(1, "小明"));
        list.addNode(new HeroNode(2, "小红"));
        list.list();
        System.out.println("------------");
        list.update(new HeroNode(2, "小鬼"));
        list.list();
        System.out.println("------------");
        list.del(1);
        list.list();
    }
}
