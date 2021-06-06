package hashtable;

/**
 * @Author: panyusheng
 * @Date: 2021/6/6
 * @Version 1.0
 *
 * 雇员链表
 */
public class EmpList {

    private Emp head;

    public void add(Emp emp) {
        if (head == null) {
            head = emp;
            return;
        }
        Emp cur = head;
        while (true) {
            if (cur.next == null) {
                break;
            }
            cur = cur.next;
        }
        cur.next = emp;
    }

    public void list() {
        if (head == null) {
            return;
        }
        Emp cur = head;
        while (true) {
            System.out.println("id = " + cur.id + " name = " + cur.name);
            if (cur.next == null) {
                break;
            }
            cur = cur.next;
        }
        System.out.println();
    }

    public Emp findEmpById(int id) {
        if (head == null) {
            return null;
        }
        Emp cur = head;
        while (true) {
            if (cur.id == id) {
                break;
            }
            if (cur.next == null) {
                cur = null;
                break;
            }
            cur = cur.next;
        }
        return cur;
    }



}
