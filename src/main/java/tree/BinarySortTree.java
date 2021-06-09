package tree;

/**
 * @Author: panyusheng
 * @Date: 2021/6/8
 * @Version 1.0
 */
public class BinarySortTree {
    private Node2 root;

    public void add(Node2 node) {
        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    public void infixOrder() {
        if (this.root != null) {
            this.root.infixOrder();
        } else {
            System.out.println("二叉树为空");
        }
    }

    public void del(int value) {
        if (this.root == null) {
            return;
        } else {
            Node2 targetNode = search(value);
            if (targetNode == null) {
                return;
            }
            // 只有一个root节点
            if (this.root.getLeft() == null && this.root.getRight() == null) {
                root = null;
                return;
            }
            // 找父节点
            Node2 parent = searchParent(value);
            // 删的是叶子节点
            if (targetNode.getLeft() == null && targetNode.getRight() == null) {
                if (parent.getLeft() != null && parent.getLeft().getValue() == value) {
                    parent.setLeft(null);
                } else if (parent.getRight() != null && parent.getRight().getValue() == value) {//是由子结点
                    parent.setRight(null);
                }
            } else if (targetNode.getLeft() != null && targetNode.getRight() != null) {
                int maxVal = delLeftTreeMax(targetNode.getLeft());
                targetNode.setValue(maxVal);
            } else { // 删除只有一颗子树的结点
                if (targetNode.getLeft() != null) {
                    if (parent != null) { //  是 parent 的左子结点
                        if (parent.getLeft().getValue() == value) {
                            parent.setLeft(targetNode.getLeft());
                        } else {
                            parent.setRight(targetNode.getLeft());
                        }
                    } else {
                        root = targetNode.getLeft();
                    }
                } else {
                    if (parent != null) {
                        if (parent.getLeft().getValue() == value) {
                            parent.setLeft(targetNode.getRight());
                        } else {
                            parent.setRight(targetNode.getRight());
                        }
                    } else {
                        root = targetNode.getRight();
                    }
                }


            }
        }
    }

    private int delLeftTreeMax(Node2 node) {
        Node2 target = node;
        while (target.getRight() != null) {
            target = target.getRight();
        }
        del(target.getValue());
        return target.getValue();
    }

    private Node2 searchParent(int value) {
        if (root == null) {
            return null;
        } else {
            return root.searchParent(value);
        }
    }

    private Node2 search(int value) {
        if (root == null) {
            return null;
        } else {
            return root.search(value);
        }
    }

}
