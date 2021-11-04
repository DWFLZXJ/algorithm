package com.daiwf.algorithm.leetcode;

/**
 * @description: 翻转二叉树
 * @author: daiwf
 * @time: 2021-11-04
 */
public class problem226 {
    public TreeNode invertTree(TreeNode root) {


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
