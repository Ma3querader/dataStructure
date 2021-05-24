package linked.circle;

/**
 * @Author: panyusheng
 * @Date: 2021/5/24
 * @Version 1.0
 */
public class Boy {

    private int no;

    private Boy next;

    public Boy(int no) {
        this.no = no;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Boy getNext() {
        return next;
    }

    public void setNext(Boy next) {
        this.next = next;
    }
}
