//Day 22: Binary Search Trees

import java.util.Scanner;

class BinarySearchTrees {
    BinarySearchTrees left, right;
    int data;

    BinarySearchTrees(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinarySearchTree {
    public static int getHeight(BinarySearchTrees root) {
        return root == null ? -1 : 1 + Math.max(getHeight(root.left), getHeight(root.right));
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}