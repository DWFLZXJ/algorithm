package com.daiwf.algorithm.leetcode;

/**
 * @description: 完全二叉树的节点个数
 * @author: daiwf
 * @time: 2021-11-06
 */
public class problem222 {

    //不讲武德的办法比较容易懂，官方题解没看懂。。
    public int countNodes(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = countNodes(root.left);
        int right = countNodes(root.right);

        return left + right + 1;

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
