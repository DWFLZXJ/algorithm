package com.daiwf.algorithm.leetcode;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

/**
 * @description:路径总和
 * @author: daiwf
 * @time: 2021-11-11
 */
public class problem113 {

    List<List<Integer>> res = new ArrayList<>();
    Deque<Integer> path=new LinkedList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        checksum(root,targetSum);
        return res;
    }

    private void checksum(TreeNode node,int targetsum){

        if(node==null){
            return;
        }
        path.offerLast(node.val);
        if(node.left==null&&node.right==null&&targetsum-node.val==0){
            res.add(new ArrayList<>(path));
        }

        if(node.left!=null){
            checksum(node.left,targetsum-node.val);
        }
        if(node.right!=null){
            checksum(node.right,targetsum-node.val);
        }

        path.pollLast();
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
