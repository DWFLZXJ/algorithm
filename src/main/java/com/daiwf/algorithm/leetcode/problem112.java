package com.daiwf.algorithm.leetcode;

/**
 * @description:
 * @author: daiwf
 * 路径总和
 * @time: 2021-11-07
 */
public class problem112 {


    public boolean hasPathSum(TreeNode root, int targetSum) {

        if(root==null&&targetSum>0){
            return false;
        }
        if(root==null&&targetSum==0){
            return true;
        }

      return   (root.val==targetSum||hasPathSum(root.left,targetSum- root.val)||hasPathSum(root.right,targetSum- root.val));

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
