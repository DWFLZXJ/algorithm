package com.daiwf.algorithm.leetcode;

import java.util.regex.Matcher;

/**
 * @description: 平衡二叉树
 * @author: daiwf
 * @time: 2021-11-06
 */
public class problem110 {


    //用了两个递归
    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        return (Math.abs(height(root.left) - height(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right));

    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(height(root.left), height(root.right)) + 1;

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
