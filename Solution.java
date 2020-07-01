import java.util.*;
class solution {
    static class Node {
        int data;
        Node left, right;
    }

    ;

    static class INT {
        int data;
    }

    ;

    static Node reverseTreePathUtil(Node root, int data,
                                    Map<Integer, Integer> temp, int level, INT nextpos) {
        if (root == null)
            return null;
        if (data == root.data) {
            temp.put(level, root.data);
            root.data = temp.get(nextpos.data);
            nextpos.data++;
            return root;
        }
        temp.put(level, root.data);
        Node left, right = null;
        left = reverseTreePathUtil(root.left, data, temp,
                level + 1, nextpos);
        if (left == null)
            right = reverseTreePathUtil(root.right, data,
                    temp, level + 1, nextpos);
        if (left != null || right != null) {
            root.data = temp.get(nextpos.data);
            nextpos.data++;
            return (left != null ? left : right);
        }
        return null;
    }

    static void reverseTreePath(Node root, int data) {
        Map<Integer, Integer> temp = new HashMap<Integer, Integer>();
        INT nextpos = new INT();
        nextpos.data = 0;
        reverseTreePathUtil(root, data, temp, 0, nextpos);
    }

    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    static Node newNode(int data) {
        Node temp = new Node();
        temp.data = data;
        temp.left = temp.right = null;
        return temp;
    }

    public static void main(String args[]) {
        Node root = newNode(7);
        root.left = newNode(6);
        root.right = newNode(5);
        root.left.left = newNode(4);
        root.left.right = newNode(3);
        root.right.left = newNode(2);
        root.right.right = newNode(1);

    }
}