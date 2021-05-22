package linked;

/**
 * @Author: panyusheng
 * @Date: 2021/5/22
 * @Version 1.0
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();
        list.addByOrder(new HeroNode(1,"第一","第一"));
        list.addByOrder(new HeroNode(3,"第二","第二"));
        list.addByOrder(new HeroNode(2,"第二","第二"));
        list.addByOrder(new HeroNode(5,"第二","第二"));
        list.update(new HeroNode(4, "333", "333"));
        list.delete(1);
        System.out.println("-----------------");
        list.list();
        System.out.println("-----------------");
        System.out.println("有效节点数：" + list.getLenth());
        System.out.println("倒数第1个节点：" + list.findLastIndexNode(1));
        System.out.println("-----------------");
        list.reversetList();
        list.list();
    }


}
