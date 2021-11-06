package com.daiwf.algorithm.leetcode;

/**
 * @description: 翻转二叉树
 * @author: daiwf
 * @time: 2021-11-04
 */
public class problem226 {
    public TreeNode invertTree(TreeNode root) {
        //递归中止条件
        if (root == null) {
            return root;
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode right = root.right;
        TreeNode left = root.left;
        root.left = right;
        root.right = left;
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
