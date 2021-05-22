package linked;

/**
 * @Author: panyusheng
 * @Date: 2021/5/22
 * @Version 1.0
 * <p>
 * 单向链表
 */
public class SingleLinkedList {

    private HeroNode head = new HeroNode(0, "", "");    // 头节点

    public void addNode(HeroNode node) {
        HeroNode temp = head;   // 辅助指针
        while (true) {
            if (temp.next == null) {
                break;
            }
            temp = temp.next;
        }
        temp.next = node;
    }

    public void addByOrder(HeroNode node) {
        HeroNode temp = head;
        boolean flag = false; // 编号是否存在
        while (true) {
            if (temp.next == null) {
                break;
            }
            if (temp.next.no > node.no) { //位置找到，就在 temp 的后面插入
                break;
            } else if (temp.next.no == node.no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            System.out.println("编号 " + node.no + " 已存在，插入失败...");
        } else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    public void update(HeroNode node) {
        if (head.next == null) {
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        boolean flag = false; // 表示是否找到该节点
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
            temp.nickname = node.nickname;
        } else {
            System.out.println("没有找到编号为 " + node.no + " 的节点");
        }
    }

    public void delete(int no) {
        HeroNode temp = head;
        boolean flag = false; // 标志是否找到待删除节点的
        while (true) {
            if (temp.next == null) { //已经到链表的最后
                break;
            }
            if (temp.next.no == no) {
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if (flag) {
            temp.next = temp.next.next;
        } else {
            System.out.println("没有找到编号为 " + no + " 的节点");
        }
    }

    public void list() {
        if (head.next == null) {
            System.out.println("链表为空");
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


}
