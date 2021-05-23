package linked.dou;

/**
 * @Author: panyusheng
 * @Date: 2021/5/23
 * @Version 1.0
 */
public class HeroNode {

    public int no;
    public String name;
    public HeroNode next;
    public HeroNode pre;

    public HeroNode(int no, String name) {
        this.no = no;
        this.name = name;
    }

    @Override
    public String toString() {
        return "HeroNode [no=" + no + ", name=" + name + "]";
    }
}
