package linked.dou;

/**
 * @Author: panyusheng
 * @Date: 2021/5/23
 * @Version 1.0
 * <p>
 * 双向链表
 */
public class DoubleLinkedList {

    private HeroNode head = new HeroNode(0, "");

    public void list() {
        if (head.next == null) {
            System.out.println("双向链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true) {
            if (temp == null) {
                break;
            }
            System.out.println(temp);
            temp = temp.next;
        }
    }

    public void addNode(HeroNode node) {
        HeroNode temp = head;
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
        node.pre = temp;
    }

    public void update(HeroNode node) {
        if (head.next == null) {
            System.out.println("双向链表为空，没得改了");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.name = node.name;
        } else {
            System.out.println("没有编号为 " + node.no + " 节点");
        }
    }

    public void del(int no) {
        if (head.next == null) {
            System.out.println("双向链表为空，没得删了");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false;
        while (true) {
            if (temp == null) {
                break;
            }
            if (temp.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.pre.next = temp.next;
            if (temp.next != null) {
                temp.next.pre = temp.pre;
            }
        } else {
            System.out.println("没有编号为 " + no + " 节点");
        }
    }


}
