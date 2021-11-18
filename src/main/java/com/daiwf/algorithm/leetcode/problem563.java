package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @author: daiwf
 * @time: 2021-11-18
 */
public class problem563 {


    public int findTilt(TreeNode root) {

        if (root == null) {
            return 0;
        }
        return calcTilt(root) + findTilt(root.left) + findTilt(root.right);
    }

    //计算当前节点的坡度
    public int calcTilt(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 0;
        }
        return Math.abs(calcTotal(root.left) - calcTotal(root.right));

    }

    //计算当前根节点下所有节点值的和
    public int calcTotal(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val + calcTotal(root.left) + calcTotal(root.right);
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