package tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author: panyusheng
 * @Date: 2021/6/8
 * @Version 1.0
 * <p>
 * 哈夫曼树
 */
public class HuffmanTree {
    public static void main(String[] args) {
        int arr[] = {13, 7, 8, 3, 29, 6, 1};
        Node root = createHuffmanTree(arr);
        System.out.println("------------");
        preOrder(root);
    }

    private static Node createHuffmanTree(int[] arr) {
        List<Node> nodes = new ArrayList<Node>();
        for (int value : arr) {
            nodes.add(new Node(value));
        }
        while(nodes.size() > 1) {
            Collections.sort(nodes);
            //(1) 取出权值最小的结点（二叉树）
            Node leftNode = nodes.get(0);
            //(2) 取出权值第二小的结点（二叉树）
            Node rightNode = nodes.get(1);
            //(3)构建一颗新的二叉树
            Node parent = new Node(leftNode.value + rightNode.value);
            parent.left = leftNode;
            parent.right = rightNode;
            //(4)从 ArrayList 删除处理过的二叉树
            nodes.remove(leftNode);
            nodes.remove(rightNode);
            //(5)将 parent 加入到 nodes
            nodes.add(parent);
        }
        return nodes.get(0);
    }

    public static void preOrder(Node root) {
        if(root != null) {
            root.preOrder();
        }else{
            System.out.println("是空树");
        }
    }

}
