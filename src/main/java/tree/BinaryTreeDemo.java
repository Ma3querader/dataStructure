package tree;

/**
 * @Author: panyusheng
 * @Date: 2021/6/6
 * @Version 1.0
 *
 * 二叉树
 */
public class BinaryTreeDemo {
    public static void main(String[] args) {
        HeroNode root = new HeroNode(1, "宋江");
        HeroNode node2 = new HeroNode(2, "吴用");
        HeroNode node3 = new HeroNode(3, "卢俊义");
        HeroNode node4 = new HeroNode(4, "林冲");
        HeroNode node5 = new HeroNode(5, "关胜");

        BinaryTree tree = new BinaryTree();
        tree.setRoot(root);
        root.setLeft(node2);
        root.setRight(node3);
        node2.setLeft(node4);
        node4.setRight(node5);

//        tree.preOrder();
//        tree.infixOrder();
        tree.postOrder();

    }
}
