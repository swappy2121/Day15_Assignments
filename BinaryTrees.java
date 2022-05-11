package com.Bridgelabz;

public class BinaryTrees {
    public static TreeNode root;

    public static class TreeNode {
        TreeNode left;
        TreeNode right;
        int data;

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void CreatBinaryTrees() {
        TreeNode first = new TreeNode(56);
        TreeNode second = new TreeNode(30);
        TreeNode third = new TreeNode(70);
        TreeNode fourth = new TreeNode(22);
        TreeNode fifth = new TreeNode(40);
        TreeNode sixth = new TreeNode(11);
        TreeNode seventh = new TreeNode(3);
        TreeNode eighth = new TreeNode(16);
        TreeNode nineth = new TreeNode(60);
        TreeNode tenth = new TreeNode(95);
        TreeNode eleventh = new TreeNode(65);
        TreeNode twelveth = new TreeNode(63);
        TreeNode thirteenth = new TreeNode(67);

        root = first;
        first.left = second;
        first.right = third;
        fourth.left = sixth;
        sixth.left = seventh;
        sixth.right = eighth;
        third.left = nineth;
        third.right = tenth;
        nineth.left = eleventh;
        eleventh.left = twelveth;
        eleventh.right = thirteenth;
    }

    public void preorder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public int size(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return size(root.left) + size(root.right) + 1;
    }

    public static void main(String[] args) {
        BinaryTrees values = new BinaryTrees();
        values.CreatBinaryTrees();
        values.preorder(values.root);
        values.size(values.root);
    }
}
