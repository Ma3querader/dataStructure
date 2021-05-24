package linked.circle;

/**
 * @Author: panyusheng
 * @Date: 2021/5/24
 * @Version 1.0
 *
 * 单向环形链表
 */
public class CircleSingleLinkedList {

    private Boy first = null;

    public void addBoy(int nums) {
        if (nums < 1) {
            System.out.println("参数有误");
            return;
        }
        Boy temp = null;
        for (int i = 1; i <= nums; i++) {
            Boy boy = new Boy(i);
            if (i == 1) {
                first = boy;
                first.setNext(first); // 构成环
                temp = first;
            } else {
                temp.setNext(boy);//
                boy.setNext(first);//
                temp = boy;
            }
        }
    }

    public void showBoy() {
        if (first == null) {
            System.out.println("没有boy");
            return;
        }
        Boy temp = first;
        while (true) {
            System.out.println("boy的编号：" + temp.getNo());
            if (temp.getNext() == first) {// 说明已经遍历完毕
                break;
            }
            temp = temp.getNext();
        }
    }

    /**
     * 计算出小孩出圈的顺序，约瑟夫问题
     *
     * @param startNo 从第几个boy开始数数
     * @param countNum 数几下
     * @param nums boy数
     * @return 
     */
    public void countBoy(int startNo, int countNum, int nums) {
        if (first == null || startNo < 1 || startNo > nums || nums < 1) {
            System.out.println("参数输入有误， 请重新输入");
            return;
        }
        Boy temp = first;
        while (true) {
            if (temp.getNext() == first) {
                break;
            }
            temp = temp.getNext();  // 让temp指向链表最后一个节点
        }
        // 从第几个boy开始数数，头尾同时移动 i - 1 次
        for (int i = 0; i < startNo - 1; i++) {
            first = first.getNext();
            temp = temp.getNext();
        }
        // 当小孩报数时，头尾同时移动 j - 1 次, 然后出圈， 直到剩下一个boy
        while(true) {
            if (temp == first) {
                break;
            }
            for(int j = 0; j < countNum - 1; j++) {
                first = first.getNext();
                temp = temp.getNext();
            }
            System.out.println("出圈编号：" + first.getNo());
            first = first.getNext();
            temp.setNext(first);
        }
        System.out.println("最后留在圈中的小孩编号：" + first.getNo());
    }


}
