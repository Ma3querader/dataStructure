package tree;

/**
 * @Author: panyusheng
 * @Date: 2021/6/7
 * @Version 1.0
 */
public class ThreadedBinaryTree {
    private HeroNode2 root;

    private HeroNode2 pre = null;

    public void setRoot(HeroNode2 root) {
        this.root = root;
    }

    public void threadedNodes() {
        this.threadedNodes(root);
    }

    public void threadedNodes(HeroNode2 node) {
        if(node == null) {
            return;
        }
        threadedNodes(node.getLeft());
        if (node.getLeft() == null) {
            node.setLeft(pre);
            node.setLeftType(1);
        }
        if (pre != null && pre.getRight() == null) {
            pre.setRight(node);
            pre.setRightType(1);
        }
        pre = node;
        threadedNodes(node.getRight());
    }

    public void threadedList() {
        HeroNode2 node = root;
        while (node != null) {
            while (node.getLeftType() == 0) {
                node = node.getLeft();
            }
            System.out.println(node);
            while(node.getRightType() == 1) {
                node = node.getRight();
                System.out.println(node);
            }
            node = node.getRight();
        }
    }




}
